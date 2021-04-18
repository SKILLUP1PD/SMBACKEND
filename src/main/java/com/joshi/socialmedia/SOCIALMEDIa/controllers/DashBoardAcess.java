package com.joshi.socialmedia.SOCIALMEDIa.controllers;

import com.joshi.socialmedia.SOCIALMEDIa.dao.DashBoardDao;
import com.joshi.socialmedia.SOCIALMEDIa.dashboard.DashboardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RequestMapping("/v1")
@RestController
public class DashBoardAcess {

    @Autowired
    private DashBoardDao dashBoardDao;

    @RequestMapping(value="/addingArticle",method = RequestMethod.POST)
    public ResponseEntity<DashboardEntity> addArticle(@Valid @RequestBody DashboardEntity dashboardEntity){

        return null;
    }

    @RequestMapping(value="/deleteArticle",method = RequestMethod.DELETE)
    public ResponseEntity<DashboardEntity> addArticle(@RequestParam Integer id,@RequestParam String username){

        return null;
    }

    @RequestMapping(value="/getAllArticle",method=RequestMethod.GET)
    public ResponseEntity<DashboardEntity> addArticle(@RequestParam String tableName){

        return null;
    }

}
