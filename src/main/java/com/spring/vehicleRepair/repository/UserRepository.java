package com.spring.vehicleRepair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.vehicleRepair.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
