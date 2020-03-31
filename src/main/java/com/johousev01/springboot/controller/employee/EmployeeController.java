package com.johousev01.springboot.controller.employee;

import com.johousev01.springboot.service.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    /*EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    */
    @GetMapping("/employee")
    @ResponseBody
    public List<Map<String, Object>> getEmployee(){
        return employeeService.getEmployee();
    }
}
