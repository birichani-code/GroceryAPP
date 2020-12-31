package com.saha.vehicleManagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController {
	@GetMapping("/vehicleModels")
	public String getVehicleModel() {
		return "vehicleModel";
	}
}
