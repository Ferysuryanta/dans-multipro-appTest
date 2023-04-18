package com.dans.multipro.test.controller;

import javax.validation.Valid;

import com.dans.multipro.test.dto.Login;
import com.dans.multipro.test.dto.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dans.multipro.test.dto.ApiResponse;
import com.dans.multipro.test.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody Login loginRequest) {
        return ResponseEntity.ok(authService.loginProcess(loginRequest));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUp signUpRequest) {
        return ResponseEntity.created(authService.signupProcess(signUpRequest))
                .body(new ApiResponse("User registered successfully"));
    }

}
