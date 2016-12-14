package com.dade.dao;

import com.dade.domain.user.HunterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Dade on 2016/12/14.
 */
public interface HunterUserDao extends JpaRepository<HunterUser, Long> {

    List<HunterUser> findByAddress(String address);

    HunterUser findByNameAndAddress(String name, String address);

    @Query("select u from HunterUser u where u.name= :name")
    HunterUser withNameQuery(@Param("name") String name);

}
