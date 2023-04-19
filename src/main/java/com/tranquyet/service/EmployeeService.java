package com.tranquyet.service;

import com.tranquyet.entity.primary.PrimaryEmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<PrimaryEmployeeEntity> getAll();
}
