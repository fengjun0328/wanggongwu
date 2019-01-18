package mc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import mc.pojo.User;
import org.springframework.stereotype.Service;

import mc.dao.UserMapper;
import mc.service.UsersService;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

    @Resource
    private UserMapper userMapper;


    @Override
    public User login(User user) {
      return  userMapper.login(user);

    }
}
