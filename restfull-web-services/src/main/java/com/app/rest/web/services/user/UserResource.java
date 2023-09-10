package com.app.rest.web.services.user;

import java.net.URI;
import java.util.List;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
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

import jakarta.validation.Valid;

@RestController
public class UserResource {

	private UserDaoService userDaoService;

	public UserResource(UserDaoService userDaoService) {
		this.userDaoService = userDaoService;
	}

	@GetMapping("/users")
	public List<User> getListOfUSers() {
		return userDaoService.getAllUsers();
	}

	@GetMapping("/userss/{id}")
	public User getUserById1(@PathVariable int id) {
		User user = userDaoService.findOne(id);
		System.out.println("sonu123:::" + user);

		if (user == null) {
			throw new UserNotFoundException("User Id:" + id);
		}

		return user;
	}

	// with HATEOS setup
	@GetMapping("/users/{id}")
	public EntityModel<User> getUserById(@PathVariable int id) {
		User user = userDaoService.findOne(id);
		System.out.println("sonu123:::" + user);

		if (user == null) {
			throw new UserNotFoundException("User Id:" + id);
		}
		EntityModel<User> entityModel = EntityModel.of(user);
		WebMvcLinkBuilder link=linkTo(methodOn(this.getClass()).getListOfUSers());
		entityModel.add(link.withRel("all-users"));

		return entityModel;
	}

	@DeleteMapping("/users/{id}")
	public void deleteUserById(@PathVariable int id) {
		userDaoService.deleteUserById(id);
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
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User save = userDaoService.saveUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(save.getId())
				.toUri();
		System.out.println("Sonu:::" + location);

		return ResponseEntity.created(location).build();
	}

}
