package com.synapse.repository;

import com.synapse.model.Employee_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employee_Repo extends JpaRepository<Employee_Details, Long> {

}
