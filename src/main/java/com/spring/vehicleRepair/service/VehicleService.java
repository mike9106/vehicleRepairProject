package com.spring.vehicleRepair.service;

import org.springframework.stereotype.Service;

import com.spring.vehicleRepair.repository.VehicleRepository;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
}
