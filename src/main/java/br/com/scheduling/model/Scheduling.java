package br.com.scheduling.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Scheduling {
	
	@Column(name = "schedule_id")
	private Integer scheduleId;
	
	public Scheduling() {
		
	}
	
	public Scheduling(Integer scheduleId) {
		super();
		this.scheduleId = scheduleId;
	}

	public Integer getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}
	
	

}
