package com.nagarro.employeemanagementapi.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.nagarro.employeemanagementapi.model.Employee;
import com.nagarro.employeemanagementapi.repositories.EmployeeRepository;
import com.nagarro.employeemanagementapi.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Override
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }
    
    @Override
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeRepository.getOne(id);
    }
    
    @Override
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.saveAndFlush(employee);
    }
    @Override
    public void delete(@PathVariable Long id){
        employeeRepository.deleteById(id);
    }


}
