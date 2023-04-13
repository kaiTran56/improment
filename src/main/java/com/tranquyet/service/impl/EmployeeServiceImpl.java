package com.tranquyet.service.impl;

import com.tranquyet.entity.EmployeeEntity;
import com.tranquyet.repository.EmployeeRepository;
import com.tranquyet.service.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<EmployeeEntity> getAll() {
        return employeeRepository.findAll(PageRequest.of(0, 11)).getContent();
//        return null;
    }
}
