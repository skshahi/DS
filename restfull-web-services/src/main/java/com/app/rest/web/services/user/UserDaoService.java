package com.app.rest.web.services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users=new ArrayList<>();
	
	static Integer incrementId=0;
	static
	{
		users.add(new User(++incrementId,"sonu",LocalDate.now().minusYears(25)));
		users.add(new User(++incrementId,"vivvan",LocalDate.now().minusYears(1)));
		users.add(new User(++incrementId,"atul",LocalDate.now().minusYears(10)));
		users.add(new User(++incrementId,"shivam",LocalDate.now().minusYears(9)));
	}
	
	public List<User> getAllUsers()
	{
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user ->user.getId().equals(id); 
		/* return users.stream().filter(predicate).findFirst().get(); */
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

	public User saveUser(User user) {
		user.setId(++incrementId);
		users.add(user);
		return user;
		
	}

	public void deleteUserById(int id) {
		
		
		Predicate<? super User> predicate = user ->user.getId().equals(id); 
		users.removeIf(predicate);
	}
	
	

}
