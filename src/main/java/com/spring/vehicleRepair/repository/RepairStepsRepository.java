package com.spring.vehicleRepair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.vehicleRepair.model.RepairSteps;

@Repository
public interface RepairStepsRepository extends JpaRepository<RepairSteps, Long> {

}
