package com.geekster.Employment.Management.System.Repository;


import com.geekster.Employment.Management.System.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployee extends JpaRepository<Employee, Long> {

}

