package com.higgsup.hibernate.controller;

import com.higgsup.hibernate.dao.UserDAO;
import com.higgsup.hibernate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by anhvu on 18-Apr-18.
 */
@Controller
public class UserController {

    @Autowired
    private UserDAO userDao;

    @GetMapping(value="/user")
    public String home() {
        List<User> listUsers = userDao.list();
        return "user";
    }
}
