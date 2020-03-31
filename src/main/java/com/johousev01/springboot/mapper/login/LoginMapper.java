package com.johousev01.springboot.mapper.login;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@Mapper
public interface LoginMapper {
    Integer saveRegister(Map<String,Object> tmpMap);
    Map<String, Object> selectLogin(Map<String,Object> tmpMap);

}
