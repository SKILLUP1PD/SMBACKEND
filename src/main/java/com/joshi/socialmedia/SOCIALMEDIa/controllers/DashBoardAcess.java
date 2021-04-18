package com.joshi.socialmedia.SOCIALMEDIa.controllers;

import com.joshi.socialmedia.SOCIALMEDIa.dashboard.DashboardEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RequestMapping("/v1")
@RestController
public class DashBoardAcess {

    @RequestMapping(value="/addingArticle",method = RequestMethod.POST)
    public ResponseEntity<DashboardEntity> addArticle(@Valid @RequestBody DashboardEntity dashboardEntity){

    }

    @RequestMapping(value="/deleteArticle",method = RequestMethod.DELETE)
    public ResponseEntity<DashboardEntity> addArticle(@RequestParam Integer id,@RequestParam String username){

    }

    @RequestMapping(value="/getAllArticle",method=RequestMethod.GET)
    public ResponseEntity<DashboardEntity> addArticle(@RequestParam String tableName){

    }


}
