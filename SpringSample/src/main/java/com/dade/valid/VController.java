package com.dade.valid;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by Dade on 2016/12/1.
 */
@RestController
@RequestMapping("/api/v")
public class VController {

    @RequestMapping("/test")
    public VUser test(@Valid @RequestBody VUser user, Errors errors){
        if (errors.hasErrors()){
            VUser vUser = new VUser();
            vUser.setName("errors");
            return vUser;
        }
        return user;
    }

}
