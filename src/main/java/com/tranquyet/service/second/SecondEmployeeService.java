package com.tranquyet.service.second;

import com.tranquyet.entity.second.SecondEmployeeEntity;
import com.tranquyet.repository.second.SecondEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecondEmployeeService {
    @Autowired
    private SecondEmployeeRepository secondEmployeeService;

    public List<SecondEmployeeEntity> getAll(){
        return secondEmployeeService.findAll(PageRequest.of(1, 10)).getContent();
    }
}
