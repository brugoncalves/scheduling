package br.com.scheduling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.scheduling.model.Scheduling;

public interface SchedulingRepository extends JpaRepository<Scheduling, Integer>{

}
