package org.tnsif.placementmanagement.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
/*Program to demonstrate on RESTful API's and it contains
 * business logic of an application*/
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placementmanagement.entities.User;
/*it is used to create controllers for REST API's which can
 * return JSON*/
import org.tnsif.placementmanagement.services.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	//RESTful API's method
	@PostMapping("/user")
	public void insert(@RequestBody User user)
	{
		service.create(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	@GetMapping("/user")
	public List<User>retriveA()
	{
		return service.retriveAll();
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> retreive(@PathVariable Integer id)
	{
		try {
			User user=service.retrieve(id);
			return new ResponseEntity<User>(user,HttpStatus.OK);

		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User>update (@RequestBody User user,@PathVariable Integer id)
	{
		try {
		User c=service.retrieve(id);
		service.create(user);
		return new ResponseEntity<User>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	

}
