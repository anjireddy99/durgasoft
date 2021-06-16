package com.micro.plan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.plan.entity.Plan;



@Repository
public interface PlanRepository extends JpaRepository<Plan, String> {
	
}
