package com.higgsup.hibernate.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by anhvu on 23-Apr-18.
 */
@Data
public class UserDto implements Serializable {
    private Long id;
    private String username;
    private String password;
    private String email;
}
