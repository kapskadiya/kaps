package com.home.kaps.controller;

import com.home.kaps.dto.DashboardDeepViewDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kaps/api_v1")
public class DashboardViewResource {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome Users!";
	}

	@PostMapping("/get/view")
	public String getDeepDashboardView(@RequestBody DashboardDeepViewDTO request){

		return null;
	}

	@PostMapping("/create/view")
	public String createDashboardView(@RequestBody DashboardDeepViewDTO request){

		return null;
	}

	@PostMapping("/update/view")
	public String updateDashboardView(@RequestBody DashboardDeepViewDTO request){

		return null;
	}
}
