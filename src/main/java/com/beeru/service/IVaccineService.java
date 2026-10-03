package com.beeru.service;

import com.beeru.model.Vaccine;

public interface IVaccineService {
 String registerVaccineInfo(Vaccine vaccine);
 Iterable<Vaccine> registerMultipleVaccine( Iterable<Vaccine>vaccines); 
 long count();
 boolean checkAvailability(Integer id);
 Iterable<Vaccine> fetchVaccineInfo();
 Iterable<Vaccine>fetchVaccineBasedOnIds(Iterable<Integer> ids);
}
