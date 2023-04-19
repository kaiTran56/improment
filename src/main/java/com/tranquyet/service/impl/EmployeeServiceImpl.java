package com.tranquyet.service.impl;

import com.tranquyet.entity.primary.PrimaryEmployeeEntity;
import com.tranquyet.service.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<PrimaryEmployeeEntity> getAll() {
        return null;
    }
}
