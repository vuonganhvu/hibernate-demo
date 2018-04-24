package com.higgsup.hibernate.oauth;

import com.higgsup.hibernate.dao.UserDAO;
import com.higgsup.hibernate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anhvu on 24-Apr-18.
 */
public class CustomUserDetailDAO implements UserDetailsService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetail user = findUserbyUername(username);

        org.springframework.security.core.userdetails.User.UserBuilder builder = null;
        if (user != null) {
            builder = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.password(new BCryptPasswordEncoder().encode(user.getPassword()));
            List<GrantedAuthority> authorities = new ArrayList<>();
            for(String role: user.getRoles()){
                authorities.add(new SimpleGrantedAuthority(role));
            }
            builder.authorities(authorities);
        } else {
            throw new UsernameNotFoundException("User not found.");
        }

        return builder.build();
    }

    private UserDetail findUserbyUername(String username) {
       return userDAO.findUserbyUername(username);
    }
}
