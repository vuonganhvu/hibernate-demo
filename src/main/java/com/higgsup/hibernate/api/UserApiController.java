package com.higgsup.hibernate.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserApiController {

    @GetMapping("/detail")
    public ResponseEntity<String> getUserInfo(){
        return ResponseEntity.ok("OK");
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST, produces = "application/json")
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
}
