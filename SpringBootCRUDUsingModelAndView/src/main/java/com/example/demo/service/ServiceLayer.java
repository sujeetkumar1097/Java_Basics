package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Repositry;
import com.example.demo.pojo.Laptop;

@Service
public class ServiceLayer {
	
	@Autowired
	private Repositry repo; 
	
	public Laptop addLaptop(Laptop lap) {
		return repo.save(lap);
	}

	public List getAllLaptops() {
		List<Object> laptops = new ArrayList<>();
		Iterable<Laptop> laps = repo.findAll();
		Iterator itr = laps.iterator();
		while(itr.hasNext()) {
			Laptop lap = (Laptop) itr.next();
			System.out.println(lap);
			laptops.add(lap);
		}
		return laptops;
	}

	public Laptop getLaptopById(Integer lapId) {
		Optional<Laptop> lap = repo.findById(lapId);
		if(lap.isPresent()) {
			return lap.get();
		}
		System.out.println("Nothing to update");
		return (Laptop) Optional.empty().get();
	}

	public List<Laptop> deleteLaptopById(Integer lapId) {
		Optional<Laptop> lap = repo.findById(lapId);
		if (lap.isPresent()) {
			repo.deleteById(lapId);
			List<Laptop> laptops = getAllLaptops();
			return laptops;
		}
		System.out.println("Nothing to Delete");
		return List.of();
	}

	public List<Laptop> updateLaptopById(int lapId, Laptop lap) {
		Laptop lap1 = repo.findById(lapId).get();
		lap1.setLapName(lap.getLapName());
		lap1.setColor(lap.getColor());
		repo.save(lap1);
		List<Laptop> laptops = getAllLaptops();
		return laptops;
	}

}
