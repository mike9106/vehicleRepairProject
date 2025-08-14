package com.spring.vehicleRepair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.vehicleRepair.model.RepairOrder;

@Repository
public interface RepairOrderRepository extends JpaRepository<RepairOrder, Long> {

}
