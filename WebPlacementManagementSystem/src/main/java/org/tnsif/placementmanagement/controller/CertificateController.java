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
import org.tnsif.placementmanagement.entities.Certificate;
import org.tnsif.placementmanagement.services.CertificateService;

@RestController
public class CertificateController {
	@Autowired
	private CertificateService service;
	
	//RESTful API's method
	@PostMapping("/certificate")
	public void addCertificate(@RequestBody Certificate certificate) {
		service.create(certificate);
	}
	
	@GetMapping("/certificate/{id}")
	public void searchCertificateById(@PathVariable Integer id) {
		service.retrieveById(id);
	}
	

	
	@DeleteMapping("/acertificate/{id}")
	public void deleteCertificate(@PathVariable Integer id) {
		service.delete(id);
	}
	
	@PutMapping("/certificate/{id}")
	public ResponseEntity<Certificate> updateStudent(@RequestBody Certificate certificate, @PathVariable Integer id) {
		try {
			Certificate c = service.retrieveById(id);
			service.create(certificate);
			return new ResponseEntity<Certificate>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
		}
	}
}
