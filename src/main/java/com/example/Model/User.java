package com.example.Model;

import java.io.Serializable;

/**
 * Created by 3111266 on 2016/04/06.
 * com.example.Model
 */
public class User implements Serializable {

    private static final long serialVersionUID = -862480222234081154L;

    private String userName;

    /**
     * userName
     *
     * @return String userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
