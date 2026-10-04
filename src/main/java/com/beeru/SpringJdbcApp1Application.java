package com.beeru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.beeru.model.Vaccine;
import com.beeru.service.IVaccineService;

@SpringBootApplication
public class SpringJdbcApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringJdbcApp1Application.class, args);
		IVaccineService service = container.getBean(IVaccineService.class);
//		String status = service.registerVaccineInfo(new Vaccine("covaccine","BharatBio",1150.5));
//		System.out.println(status);
//		
//		List<Vaccine> vaccines=new ArrayList<>();
//		vaccines.add(new Vaccine("covidShield","AstraZeneca",1000.0));
//		vaccines.add(new Vaccine("spikeVax","Moderna",1100.5));
//		vaccines.add(new Vaccine("Jassen","Johnson",1000.0));
//		vaccines.add(new Vaccine("Sputnik","Russian",44444.5));
//		service.registerMultipleVaccine(vaccines).forEach(v->System.out.println(v));
		long count=service.count();
		System.out.println("the total number of vaccine saved in the database is :"+count);
		
		int id=203;
		boolean status1=service.checkAvailability(4);
		if(status1)
			System.out.println("the vaccine is available in the database");
		else
			System.out.println("the vaccine is not available");
		List <Integer>ids= Arrays.asList(1,2,3);
		service.fetchVaccineInfo().forEach(v->System.out.println(v));
service.fetchVaccineBasedOnIds(ids).forEach(v1->System.out.println(v1));

Optional<Vaccine> optional = service.fetchVaccineById(id);
if(optional.isPresent())
	System.out.println(optional.get());
else
	System.out.println("no vaccine available with id :"+id);
	}

}
