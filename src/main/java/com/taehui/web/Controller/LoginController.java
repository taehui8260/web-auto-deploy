package com.taehui.web.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/api/login")
    public ResponseEntity<String>  login(@RequestBody final Map<String, Object> params){
        String token = "tokenString";
        return new ResponseEntity<>(token, HttpStatus.OK);
    }
    @GetMapping("/api/login")
    public ResponseEntity<String>  loginGet(@RequestParam final Map<String, Object> params){
        String token = "tokenString";
        return new ResponseEntity<>(token, HttpStatus.OK);
    }
}
