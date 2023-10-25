package com.vehicle.assignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController

public class VehicleController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
		
	}
	
	@Autowired
	private VehicleService vehicleService;

	@RequestMapping("/vehicles")
	public List<Vehicle> getVehicles() {
		return vehicleService.getVehicles();
		

	}
	
	@RequestMapping(method=RequestMethod.POST, value="/vehicles")
	public void addVehicle(@RequestBody Vehicle Vehicle) {
		vehicleService.addVehicle(Vehicle);
	}
	
	@RequestMapping("/vehicles/{id}")
	public Optional<Vehicle> getVehicle(@PathVariable String id){
		System.out.println("Inside getVehicle");
		return vehicleService.getVehicle(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/vehicles/{id}")
	public void updateVehicle(@RequestBody Vehicle Vehicle, @PathVariable String id) {
		System.out.println("inside updateVehicle");
		vehicleService.updateVehicle(id, Vehicle);
	}


	@RequestMapping(method=RequestMethod.DELETE, value="/vehicles/{id}")
	public void deleteVehicle(@PathVariable String id){
		System.out.println("Inside deleteVehicle");
		vehicleService.deleteVehicle(id);
	}
}
