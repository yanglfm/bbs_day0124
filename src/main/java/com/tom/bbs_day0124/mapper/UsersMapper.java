package com.tom.bbs_day0124.mapper;

import com.tom.bbs_day0124.model.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UsersMapper {
    int insert(@Param("pojo") Users pojo);

    int insertSelective(@Param("pojo") Users pojo);

    int insertList(@Param("pojos") List<Users> pojo);

    int update(@Param("pojo") Users pojo);

    Users findOne(Users users);

    List<Users> findAll(Map map);

    Long countAllUsers();

}
