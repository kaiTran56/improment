package com.tranquyet.repository.second;

import com.tranquyet.entity.second.SecondEmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondEmployeeRepository extends JpaRepository<SecondEmployeeEntity, Long> {
}
