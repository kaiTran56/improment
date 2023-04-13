package com.tranquyet.controller.api;

import com.tranquyet.entity.EmployeeEntity;
import com.tranquyet.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeApi {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public ResponseEntity<List<EmployeeEntity>> getAll(){
        List<EmployeeEntity> employees = employeeService.getAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
