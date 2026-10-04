package com.beeru.service;

import java.util.List;
import java.util.Optional;

import com.beeru.model.Vaccine;

public interface IVaccineService {
 String registerVaccineInfo(Vaccine vaccine);
 Iterable<Vaccine> registerMultipleVaccine( Iterable<Vaccine>vaccines); 
 long count();
 boolean checkAvailability(Integer id);
 Iterable<Vaccine> fetchVaccineInfo();
 Iterable<Vaccine>fetchVaccineBasedOnIds(Iterable<Integer> ids);
 Optional<Vaccine> fetchVaccineById(Integer id); 
 String removeVaccineById(Integer id);
 String removeVaccineByIds(List<Integer> ids);
 String removeVaccineByObj(Vaccine obj);
}
