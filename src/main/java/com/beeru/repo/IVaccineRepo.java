package com.beeru.repo;

import org.springframework.data.repository.CrudRepository;

import com.beeru.model.Vaccine;

public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {

}
