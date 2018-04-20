package com.higgsup.hibernate.api;

import com.higgsup.hibernate.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserApiController {

    @GetMapping("/detail")
    public ResponseEntity<String> getUserInfo(){
        return ResponseEntity.ok("OK");
    }

    @PostMapping("/detail")
    public ResponseEntity<String> postUserInfo(){
        return ResponseEntity.ok("OK");
    }

    @PutMapping("/detail")
    public ResponseEntity<String> putUserInfo(){
        return ResponseEntity.ok("OK");
    }

    @DeleteMapping("/detail")
    public ResponseEntity<String> deleteUserInfo(){
        return ResponseEntity.ok("OK");
    }

    @RequestMapping(name = "/detail", method = RequestMethod.OPTIONS)
    public ResponseEntity<String> optionsUserInfo(){
        return ResponseEntity.ok("OK");
    }

    @PostMapping(value="/login")
    public ResponseEntity<String> login() {

        return ResponseEntity.ok("OK");
    }
}
