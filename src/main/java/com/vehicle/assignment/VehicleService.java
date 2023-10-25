package com.vehicle.assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

	@Autowired
	private VehicleDAORepository vehicleDAORepository;
	
	public List<Vehicle> getVehicles(){
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleDAORepository.findAll().forEach(vehicleList::add);
		return vehicleList;
		
	}
	public Optional<Vehicle> getVehicle(String id) {
		return vehicleDAORepository.findById(id);
	}
	
	public void updateVehicle(String id, Vehicle Vehicle) {
		vehicleDAORepository.save(Vehicle);
	}

	public void deleteVehicle(String id) {
		vehicleDAORepository.deleteById(id);
	}

	
	public void addVehicle(Vehicle Vehicle) {
		vehicleDAORepository.save(Vehicle);
	}


}
