package com.higgsup.hibernate.dao;

import com.higgsup.hibernate.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by anhvu on 18-Apr-18.
 */
public interface UserDAO {
    @Transactional
    List<User> list();
}
