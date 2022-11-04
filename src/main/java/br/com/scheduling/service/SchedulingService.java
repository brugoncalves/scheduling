package br.com.scheduling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.scheduling.model.Scheduling;
import br.com.scheduling.repository.SchedulingRepository;

@Service
public class SchedulingService {
	
	@Autowired
	private SchedulingRepository repository;
	
	
	public Boolean findByScheduleId(Integer scheduleId) {
		Scheduling sc = new Scheduling();
		Integer schedulindId = sc.getScheduleId();
		Boolean existsScheduling = repository.existsById(schedulindId);
		return existsScheduling.booleanValue();
	}

}
