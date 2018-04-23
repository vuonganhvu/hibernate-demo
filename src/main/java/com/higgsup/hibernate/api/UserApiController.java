package com.higgsup.hibernate.api;

import com.higgsup.hibernate.config.CacheDevices;
import com.higgsup.hibernate.dto.UserDto;
import com.higgsup.hibernate.entity.DevicesToken;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

/**
 * Created by anhvu on 23-Apr-18.
 */
@RestController
@RequestMapping("/api/user")
public class UserApiController {

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserInfo(@PathVariable("id") Long id){
        UserDto userDto = new UserDto();
        userDto.setId(1L);
        userDto.setEmail("anhvv@gmail.com");
        userDto.setUsername("anhvv");
        return ResponseEntity.ok(userDto);
    }

    @GetMapping("/ping/{id}")
    public ResponseEntity<UserDto> pingUser(@PathVariable("id") Long id){
        UserDto userDto = new UserDto();
        userDto.setId(1L);
        userDto.setEmail("anhvv@gmail.com");
        userDto.setUsername("anhvv");
        return ResponseEntity.ok(userDto);
    }

    @GetMapping("/login/{id}/{name}")
    public ResponseEntity<UserDto> getUserInfo(@PathVariable("id") Long id,
                                               @PathVariable("name") String name) throws Exception {
        UserDto userDto = new UserDto();
        userDto.setId(id);
        userDto.setUsername(name);
        DevicesToken authentication = new DevicesToken(userDto, null);
//        SecurityContextHolder.getContext().setAuthentication(authentication);
        CacheDevices.putDevices(id.toString(), authentication);
        return ResponseEntity.ok(userDto);
    }
}
