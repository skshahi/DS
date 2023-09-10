package com.app.rest.web.services.user;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.app.rest.web.services.user.exception.UserNotFoundException;
import com.app.rest.web.services.user.jpa.PostJPARepository;
import com.app.rest.web.services.user.jpa.UserJPARepository;

import jakarta.validation.Valid;

@RestController
public class UserJPAResource {

	private UserDaoService userDaoService;
	@Autowired
	private UserJPARepository userRepository;
	@Autowired
	private PostJPARepository postRepository;

	public UserJPAResource(UserDaoService userDaoService, PostJPARepository postRepository) {
		this.userDaoService = userDaoService;
		this.postRepository = postRepository;
	}

	@GetMapping("/jpa/users")
	public List<User> getListOfUSers() {

		// return userDaoService.getAllUsers();
		return userRepository.findAll();
	}

	@GetMapping("/jpa/userss/{id}")
	public User getUserById1(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);
		System.out.println("sonu123:::" + user);

		if (user.isEmpty()) {
			throw new UserNotFoundException("User Id:" + id);
		}

		return user.get();
	}

	// with HATEOS setup
	@GetMapping("/jpa/users/{id}")
	public EntityModel<User> getUserById(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);
		System.out.println("sonu123:::" + user);

		if (user.isEmpty()) {
			throw new UserNotFoundException("User Id:" + id);
		}
		EntityModel<User> entityModel = EntityModel.of(user.get());
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getListOfUSers());
		entityModel.add(link.withRel("all-users"));

		return entityModel;
	}

	@DeleteMapping("/jpa/users/{id}")
	public void deleteUserById(@PathVariable int id) {
		// userDaoService.deleteUserById(id);
		userRepository.deleteById(id);
	}

	@GetMapping("/jpa/users/{id}/post")
	public List<Post> getPostOfUserById(@PathVariable int id) {

		Optional<User> user = userRepository.findById(id);
		System.out.println("sonu123:::" + user);

		if (user.isEmpty()) {
			throw new UserNotFoundException("User Id:" + id);
		}

		return user.get().getPosts();
	}

	@PostMapping("/jpa/users/{id}/post")
	public ResponseEntity<Post> savePostOfUserById(@PathVariable int id, @RequestBody Post post) {

		Optional<User> user = userRepository.findById(id);

		if (user.isEmpty()) {
			throw new UserNotFoundException("User Id:" + id);
		}

		post.setUser(user.get());

		Post savePost=postRepository.save(post);
		
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savePost.getId())
				.toUri();

		//return user.get().getPosts();
		return ResponseEntity.created(location).build();
	}

	/*
	 * Way -1:
	 * 
	 * @PostMapping("/users") public void createUser(@RequestBody User user) {
	 * userDaoService.saveUser(user); }
	 */

	/*
	 * //way -2
	 * 
	 * @PostMapping("/users") public ResponseEntity<User> createUser(@RequestBody
	 * User user) { userDaoService.saveUser(user); return
	 * ResponseEntity.created(null).build(); }
	 */

	// way -3
	@PostMapping("/jpa/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User save = userRepository.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(save.getId())
				.toUri();
		System.out.println("Sonu:::" + location);

		return ResponseEntity.created(location).build();
	}

}
