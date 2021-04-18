package com.joshi.socialmedia.SOCIALMEDIa.controllers;

import com.joshi.socialmedia.SOCIALMEDIa.dao.USERDao;
import com.joshi.socialmedia.SOCIALMEDIa.userinfo.USER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RequestMapping("/v1")
@RestController
public class LoginAndRegister {

    @Autowired
    USERDao userDao;

    Logger logger= LoggerFactory.getLogger(LoginAndRegister.class);

    @RequestMapping(value = "/login",method = RequestMethod.GET )
    public ResponseEntity<String> isValidatedUser(@RequestParam String email, @RequestParam String password){

        USER user=userDao.findByEmailAndPassword(email,password);
        if(user==null){
            return new ResponseEntity<>("USER not found in database", HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>("USER is succesfully found in database",HttpStatus.ACCEPTED);
        }
    }


    @RequestMapping(value="/register",method = RequestMethod.POST)
    public ResponseEntity<String> isRegister(@Valid @RequestBody USER user){

        try {
            userDao.save(user);
        }
        catch (Exception ex){
            return new ResponseEntity<>("ex",HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>("User is successfully saved in database",HttpStatus.ACCEPTED);
    }

}
