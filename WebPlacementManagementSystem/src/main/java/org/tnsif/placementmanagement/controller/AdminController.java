package org.tnsif.placementmanagement.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placementmanagement.entities.Admin;
import org.tnsif.placementmanagement.services.AdminService;

@RestController
public class AdminController {
	@Autowired
	private AdminService service;
	
	//RESTful API's method
	@PostMapping("/admin")
	public void addAdmin(@RequestBody Admin admin) {
		service.create(admin);
	}
	
	@GetMapping("/admin/{id}")
	public void searchAdminById(@PathVariable Integer id) {
		service.retrieveById(id);
	}
	

	
	@DeleteMapping("/admin/{id}")
	public void deleteAdmin(@PathVariable Integer id) {
		service.delete(id);
	}
	
	@PutMapping("/admin/{id}")
	public ResponseEntity<Admin> updateStudent(@RequestBody Admin admin, @PathVariable Integer id) {
		try {
			Admin a = service.retrieveById(id);
			service.create(admin);
			return new ResponseEntity<Admin>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	}
}
