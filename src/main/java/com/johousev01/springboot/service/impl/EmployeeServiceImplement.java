package com.johousev01.springboot.service.impl;

import com.johousev01.springboot.mapper.employee.EmployeeMapper;
import com.johousev01.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImplement implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Map<String, Object>> getEmployee() {
        return employeeMapper.getEmployee();
    }
}
