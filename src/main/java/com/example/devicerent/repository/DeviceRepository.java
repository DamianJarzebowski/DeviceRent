package com.example.devicerent.repository;

import com.example.devicerent.model.Device;
import org.springframework.data.repository.CrudRepository;

public interface DeviceRepository extends CrudRepository<Device, Long> {
}
