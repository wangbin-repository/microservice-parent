package com.haitai.entities;

import lombok.Data;

/**
 * @Author: bin.wang
 */
@Data
public class UserDO {
    private String username;
    private String password;
    private String name;
    private String phone;
    private String email;
    private String address;

    public UserDO(String username, String password, String name, String phone, String email, String address) {
        super();
        this.username = username;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
}
