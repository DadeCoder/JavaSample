package com.dade.controller;

import com.dade.dao.HunterUserDao;
import com.dade.domain.user.HunterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Dade on 2016/12/14.
 */
@RestController
@RequestMapping("/api/user")
public class HunterUserController {

    @Autowired
    HunterUserDao hunterUserDao;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @Transactional(rollbackFor = {IllegalArgumentException.class})
    @CachePut(value = "hunter", key = "#hunterUser.id")
    public HunterUser save(@RequestBody HunterUser hunterUser){
        hunterUser.setId(null);
        hunterUser = hunterUserDao.save(hunterUser);

        if (hunterUser.getName().equals("dade")){
            throw new IllegalArgumentException("dade exist,data would rollback!");
        }

        return hunterUser;
    }

    @RequestMapping("/query")
    public List<HunterUser> query(String address){
        List<HunterUser> hunterUserList = hunterUserDao.findByAddress(address);
        return hunterUserList;
    }

    @RequestMapping("/page")
    public Page<HunterUser> page(){
        Page<HunterUser> pageHunter = hunterUserDao.findAll(new PageRequest(1,2));
        return pageHunter;
    }

}
