package org.tnsif.placementmanagement.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.Certificate;
import org.tnsif.placementmanagement.repository.CertificateRepository;
import jakarta.transaction.Transactional;
@Service
@Transactional
public class CertificateService {
	@Autowired
	private CertificateRepository repo;	
			//create and update
		public void create(Certificate certificate) {
			repo.save(certificate);
		}
		
		//retrieve with specific ID
		public Certificate retrieveById(Integer id) {
			return repo.findById(id).get();
		}		
		//delete with specific Id
		public void delete(Integer id) {
			repo.deleteById(id);
		}
	
}