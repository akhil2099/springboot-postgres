package psql.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import psql.spring.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
