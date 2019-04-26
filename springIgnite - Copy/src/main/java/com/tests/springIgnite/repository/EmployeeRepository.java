package com.tests.springIgnite.repository;

import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;
import org.springframework.stereotype.Repository;

import com.tests.springIgnite.entity.EmployeeDTO;
@Repository
@RepositoryConfig(cacheName = "baeldungCache")
public interface EmployeeRepository extends IgniteRepository<EmployeeDTO, Integer> {

    EmployeeDTO getEmployeeDTOById(Integer id);
}