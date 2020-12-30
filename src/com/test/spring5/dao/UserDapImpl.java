package com.test.spring5.dao;

public class UserDapImpl implements UserDao{
    @Override
    public void update() {
        System.out.println("dao update...");
    }
}
