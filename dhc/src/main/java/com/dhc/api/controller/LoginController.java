package com.dhc.api.controller;

import com.dhc.api.model.GoogleUser;
import com.dhc.api.model.Login;
import com.dhc.api.model.User;
import com.dhc.api.service.LoginService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.Clock;
import java.util.HashMap;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/code")
    public ResponseEntity<?> kakao(@RequestParam(value = "code", required = false) String code) throws Exception {
        System.out.println("#########" + code);
        System.out.println("kakao Login Controller");
        try {
            System.out.println(code);
            String token = loginService.getToken(code);
            System.out.println("info");
            HashMap<String, Object> ret = loginService.getUserInfo(token);
            ret.put("token", token);
            System.out.println(ret);
            return new ResponseEntity<>(ret, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping(value = "/kakaoLogout")
    public ResponseEntity<?> kakaoLogout(@RequestParam String token) {
        System.out.println("kakao Login Controller");
        try {
            System.out.println("kakaoLogout");

            return new ResponseEntity<>(loginService.kakaoLogout(token), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping(value = "/google")
    public ResponseEntity<?> google(@RequestBody GoogleUser user) {
        System.out.println("google Login Controller");
        try {
            System.out.println(user);
            System.out.println("info");
            loginService.googleLogin(user);
            return new ResponseEntity<>("login Success", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("login fail", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping(value = "/github")
    public ResponseEntity<?> github(@RequestParam String code) {
        System.out.println("github Login Controller");
        try {
            System.out.println(code);
            String token = loginService.getGithubToken(code);
            System.out.println("info");
            HashMap<String, Object> ret = loginService.getGithubUserInfo(token);
            ret.put("token", token);
            System.out.println(ret);
            return new ResponseEntity<>(ret, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @PostMapping(value = "/overLapCheck")
    public ResponseEntity<?> overLapCheck(@RequestParam String id) {
        System.out.println("overLapCheck Controller");
        try {
            if (loginService.overLapCheck(id)) {
                return new ResponseEntity<>("success", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("fail", HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}