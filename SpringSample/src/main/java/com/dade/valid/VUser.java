package com.dade.valid;

import javax.validation.constraints.NotNull;

/**
 * Created by Dade on 2016/12/1.
 */
public class VUser {

    @NotNull
    String id;

    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
