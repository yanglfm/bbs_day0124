package com.tom.bbs_day0124.service;

import com.tom.bbs_day0124.constants.ResultEntity;
import com.tom.bbs_day0124.model.Users;

import java.util.List;
import java.util.Map;

public interface UsersService {
    ResultEntity<Users> login(Users users);

    List<Users> usersPage(Map map);

    Long usersCount();


}
