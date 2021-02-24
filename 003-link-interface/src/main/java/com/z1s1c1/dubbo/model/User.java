package com.z1s1c1.dubbo.model;

import java.io.Serializable;

public class User  implements Serializable {
    private Integer id;
    private String useranme;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUseranme() {
        return useranme;
    }

    public void setUseranme(String useranme) {
        this.useranme = useranme;
    }
}
