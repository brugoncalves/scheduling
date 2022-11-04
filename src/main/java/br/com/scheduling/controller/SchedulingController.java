package br.com.scheduling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.scheduling.service.SchedulingService;

@RestController
@RequestMapping(value = "/scheduling")
public class SchedulingController {

	@Autowired
	private SchedulingService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Boolean>existsById(@PathVariable Integer scheduleId){
		Boolean scheduling = service.findByScheduleId(scheduleId);
		return ResponseEntity.ok().body(scheduling);
	}
}
