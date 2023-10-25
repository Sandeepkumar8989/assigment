package com.vehicle.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	private String id;
	private String vehicleName;
	private String vehicleColor;
	public Vehicle() {
		super();
		
	}
	
	public Vehicle(String id, String vehicleName, String vehicleColor) {
		super();
		this.id = id;
		this.vehicleName = vehicleName;
		this.vehicleColor = vehicleColor;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleColor() {
		return vehicleColor;
	}
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}
	
	
}
