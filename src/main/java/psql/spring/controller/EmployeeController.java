package psql.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import psql.spring.model.Employee;
import psql.spring.service.EmployeeService;

@RestController
//  @RequestMapping("/view")

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping()
    public List<Employee> getAll(){

        return employeeService.getAll();
    }

}
