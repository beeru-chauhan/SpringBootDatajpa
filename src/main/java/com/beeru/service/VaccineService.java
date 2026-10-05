package com.beeru.service;

import java.util.List;
import java.util.Optional;

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
	@Override
	public Optional<Vaccine> fetchVaccineById(Integer id) {
	 return repo.findById(id);
	 
	}
	@Override
	public String removeVaccineById(Integer id) {
//	Optional<Vaccine> optional = repo.findById(id);
//	if(optional.isPresent())
//	{
//		repo.deleteById(id);
//		return "the vaccine with id :"+id+"id deleted";
//	}
		boolean status = repo.existsById(id);
		if(status)
		{
			repo.deleteById(id);
			return "the vaccine with id :"+id+"id deleted";
		}
		return "the vaccine with id :"+id+" is not available in the database";
	}
	@Override
	public String removeVaccineByIds(List<Integer> ids) {
		List<Vaccine> vaccines = (List<Vaccine>)repo.findAllById(ids);
		int dbcount = vaccines.size();
		
		int clintCount = ids.size();
		if(clintCount==dbcount)
		{
			repo.deleteAllById(ids);
			return "vaccine info is deleted from records for the given ids";
		}
		return "failed to delete vaccine info for given ids";
	}
	@Override
	public String removeVaccineByObj(Vaccine obj) {
		// TODO Auto-generated method stub
		return null;
	}
 
}
