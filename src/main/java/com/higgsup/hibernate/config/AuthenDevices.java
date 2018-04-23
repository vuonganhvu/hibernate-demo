package com.higgsup.hibernate.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.http.ResponseEntity;

/**
 * Created by anhvu on 23-Apr-18.
 */

public class AuthenDevices {

    public ResponseEntity aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        return (ResponseEntity) proceedingJoinPoint.proceed();
    }
}
