package com.oocl.springbootemployee.repository;

import com.oocl.springbootemployee.model.Employee;
import com.oocl.springbootemployee.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> getAllByGender(Gender gender);

    Employee getAllById(Integer id);

}
