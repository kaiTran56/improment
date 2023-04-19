package com.tranquyet.repository.primary;

import com.tranquyet.entity.primary.PrimaryEmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryEmployeeRepository extends JpaRepository<PrimaryEmployeeEntity, Long> {
}
