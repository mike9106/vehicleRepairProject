package com.spring.vehicleRepair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.vehicleRepair.model.RepairLogs;

@Repository
public interface RepairLogsRepository extends JpaRepository<RepairLogs, Long> {

}
