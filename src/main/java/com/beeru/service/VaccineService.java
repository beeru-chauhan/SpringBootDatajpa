package com.beeru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beeru.model.Vaccine;
import com.beeru.repo.IVaccineRepo;
@Service
public class VaccineService implements IVaccineService {
    @Autowired
	private IVaccineRepo repo;

	@Override
	public String registerVaccineInfo(Vaccine vaccine) {
		System.out.println(repo.getClass().getName());
		Vaccine vac = repo.save(vaccine);
		return "the vaccine info is saved in database with id :"+vac.getId();
	}

	@Override
	public Iterable<Vaccine> registerMultipleVaccine(Iterable<Vaccine> vaccines) {
		
		return repo.saveAll(vaccines);
	}
	@Override
	public long count() {
		
		return repo.count();
	}
	
	@Override
	public boolean checkAvailability(Integer id) {
		
		return repo.existsById(id);
		
	} 
	
	@Override
	public Iterable<Vaccine> fetchVaccineInfo() {
		
		return repo.findAll();
	}
	
	@Override
	public Iterable<Vaccine> fetchVaccineBasedOnIds(Iterable<Integer> ids) {
		
		return repo.findAllById(ids);
	}

}
