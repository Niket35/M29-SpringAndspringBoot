package org.tnsif.placementmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.Admin;
import org.tnsif.placementmanagement.repository.AdminRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminService {
	
	@Autowired
	private AdminRepository repo;
	
	
		//create and update
		public void create(Admin admin) {
			repo.save(admin);
		}
		
		//retrieve with specific ID
		public Admin retrieveById(Integer id) {
			return repo.findById(id).get();
		}
		

		
		//delete with specific Id
		public void delete(Integer id) {
			repo.deleteById(id);
		}
	
}
