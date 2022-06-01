package com.rest.entity;

import org.springframework.stereotype.Component;

@Component
public class Gorod {

    private String tel = "+78462600829";

    private String city;

    public Gorod(String tel, String city) {
        this.tel = tel;
        this.city = city;
    }

    public Gorod() {
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
