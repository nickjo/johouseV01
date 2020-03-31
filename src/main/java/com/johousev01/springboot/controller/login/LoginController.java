package com.johousev01.springboot.controller.login;

import com.johousev01.springboot.service.login.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    LoginService loginService;

    // 회원가입
    @PostMapping("/register.do")
    public ResponseEntity<?> saveRegister(HttpServletRequest request){
        System.out.println("== saveRegister start ==");
        Map<String, Object> out = new HashMap<>();

        try {
            out.put("result", (loginService.saveRegister(request)).get("result"));
            System.out.println("= success: " + out.toString());
            return ResponseEntity.ok(out);
        } catch (Exception e) {
            out.put("status", "error");
            System.out.println("= error: " + out.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
            return ResponseEntity.badRequest().body(out);
        }
    }

    // 로그인
    @PostMapping("/login.do")
    public ResponseEntity<?> selectLogin(HttpServletRequest request){
        System.out.println("== selectLogin start ==");
        Map<String, Object> out = new HashMap<>();

        try {
            out.put("result", (loginService.selectLogin(request)).get("result"));
            System.out.println("= success: " + out.toString());
            return ResponseEntity.ok(out);
        }catch (Exception e){
            out.put("status", "error");
            System.out.println("= error: " + out.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
            return ResponseEntity.badRequest().body(out);
        }
    }
}
