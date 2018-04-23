package com.higgsup.hibernate.config;

import com.higgsup.hibernate.entity.DevicesToken;
import org.springframework.http.HttpRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by anhvu on 23-Apr-18.
 */

public class CustomFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("custom filter");
//        SecurityContextHolder.getContext().getAuthentication();
        DevicesToken devicesToken = CacheDevices.getDevices(((HttpServletRequest) servletRequest).getHeader("token"));
        if(devicesToken != null){
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}
