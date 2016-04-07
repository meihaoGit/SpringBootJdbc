package com.example.service;

        import com.example.dao.UserMapper;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

/**
 * Created by 3111266 on 2016/04/06.
 * com.example.service
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public String getUserName() {

        String userName = userMapper.getUserName();

        return userName;
    }
}
