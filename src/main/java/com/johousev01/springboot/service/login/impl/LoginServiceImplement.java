package com.johousev01.springboot.service.login.impl;

import com.johousev01.springboot.mapper.login.LoginMapper;
import com.johousev01.springboot.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImplement implements LoginService {
    @Autowired
    LoginMapper loginMapper;

    @Override
    public Map<String, Object> saveRegister(HttpServletRequest request){
        System.out.println("==LoginServiceImplement saveRegister()");
        Map<String, Object> inDto = new HashMap<>();
        Map<String, Object> outDto = new HashMap<>();
        int result;

        String registerName = request.getParameter("registerName");
        String registerEmail = request.getParameter("registerEmail");
        String registerPassword = request.getParameter("registerPassword");

        inDto.put("REGISTER_NAME", registerName);
        inDto.put("REGISTER_EMAIL", registerEmail);
        inDto.put("REGISTER_PASSWORD", registerPassword);

        System.out.println("==registerName: " + registerName + ",registerEmail: " + registerEmail + ",registerPassword: " + registerPassword);

        result = loginMapper.saveRegister(inDto);

        outDto.put("result", "success");
        System.out.println("==result: " + result);

        return outDto;
    }

    @Override
    public Map<String, Object> selectLogin(HttpServletRequest request) {
        System.out.println("==LoginServiceImplement selectLogin()");
        Map<String, Object> inDto = new HashMap<>();
        Map<String, Object> outDto = new HashMap<>();
        Map<String, Object> resultDto = new HashMap<>();

        String loginEmail = request.getParameter("loginEmail");
        String loginPassword = request.getParameter("loginPassword");

        inDto.put("LOGIN_EMAIL", loginEmail);
        inDto.put("LOGIN_PASSWORD", loginPassword);

        System.out.println("==loginEmail: " + loginEmail + ",loginPassword: " + loginPassword);

        resultDto = loginMapper.selectLogin(inDto);
        System.out.println("==resultDto: " + resultDto.toString());

        if(resultDto.size() > 0){
            outDto.put("result", "success");
        }else{
            outDto.put("result", "fail");
        }

        return outDto;
    }
}
