package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.Placement;
import org.tnsif.placementmanagement.repository.PlacementRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {
	
//	to inject dependency automatically
	@Autowired
	private PlacementRepository repo;
	
	
//	create
	public void create(Placement placement)
	{
		repo.save(placement);
	}
	
	
//	retrieve with specific id
	public Placement retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	
//	retrieve all record
	public List<Placement> retrieveAll()
	{
		return repo.findAll();
	}
	
//	delete with specific record
	
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	
	

}
