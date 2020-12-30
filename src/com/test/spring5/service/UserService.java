package com.test.spring5.service;

import com.test.spring5.dao.UserDao;
import com.test.spring5.dao.UserDapImpl;

public class UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add.....");
        this.userDao.update();
    }
}
