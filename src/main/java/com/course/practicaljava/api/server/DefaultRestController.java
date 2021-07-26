package com.course.practicaljava.api.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@RestController
@RequestMapping(value = "/api")
public class DefaultRestController {

	@GetMapping(value = "/welcome")
	public String defaultRestController() {
		return ("Welcome to spring boot");

	}

	@GetMapping(value= "/getTimeToday")
	public String getTime(){
		return String.valueOf(new Date());
	}

}
