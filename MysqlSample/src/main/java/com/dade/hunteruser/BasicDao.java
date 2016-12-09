package com.dade.hunteruser;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Dade on 2016/12/8.
 */
@Transactional
public interface BasicDao extends CrudRepository<HunterUser,String> {
    HunterUser findByName(String name);
}
