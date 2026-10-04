package com.beeru.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.beeru.model.Vaccine;
@Repository
public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {

}
