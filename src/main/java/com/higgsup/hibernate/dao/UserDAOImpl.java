package com.higgsup.hibernate.dao;

import com.higgsup.hibernate.entity.User;
import com.higgsup.hibernate.oauth.UserDetail;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anhvu on 18-Apr-18.
 */
public class UserDAOImpl implements UserDAO {
    private final SessionFactory sessionFactory;

    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<User> list() {
        @SuppressWarnings("unchecked")
        List<User> listUser = (List<User>) sessionFactory.getCurrentSession()
                .createCriteria(User.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return listUser;
    }

    @Override
    public UserDetail findUserbyUername(String userName) {
        //TODO query database
        UserDetail userDetail = new UserDetail();
        userDetail.setId(1);
        userDetail.setUsername(userName);
        userDetail.setPassword("123456");
        List<String> roles = new ArrayList<>();
        roles.add("ROLE_ADMIN");
        roles.add("ROLE_USER");
        userDetail.setRoles(roles);
        return userDetail;
    }
}
