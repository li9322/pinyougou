package com.li.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.li.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "li";
    }
}
