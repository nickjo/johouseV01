package com.johousev01.springboot.service.login;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface LoginService {
    Map<String, Object> saveRegister(HttpServletRequest request);
    Map<String, Object> selectLogin(HttpServletRequest request);
}
