package com.tranquyet.service.primary;

import com.tranquyet.entity.primary.PrimaryEmployeeEntity;
import com.tranquyet.repository.primary.PrimaryEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrimaryEmployeeService {
    @Autowired
    private PrimaryEmployeeRepository primaryEmployeeRepository;

    public List<PrimaryEmployeeEntity> getAll(){
        return primaryEmployeeRepository.findAll(PageRequest.of(1, 10)).getContent();
    }
}
