package com.tranquyet.controller.api;

import com.tranquyet.service.EmployeeService;
import com.tranquyet.service.primary.PrimaryEmployeeService;
import com.tranquyet.service.second.SecondEmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeApi {
//    @Autowired
//    private EmployeeService employeeService;

    @Autowired
    private PrimaryEmployeeService primaryEmployeeService;
    @Autowired
    private SecondEmployeeService secondEmployeeService;
    @GetMapping
    public ResponseEntity<?> getAll(){
        List<?> employees = primaryEmployeeService.getAll();
        log.info("------------------------- DATABASE 1 ----------------------");
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    @GetMapping("/second")
    public ResponseEntity<?> getAllAtSecondDB(){
        List<?> employees = secondEmployeeService.getAll();
        log.info("------------------------- DATABASE 2 ----------------------");
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
