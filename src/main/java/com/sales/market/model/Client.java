package com.sales.market.model;

import javax.persistence.Entity;

@Entity
public class Client extends ModelBase {

    private String name;
    private String email;
    private int birthdayDay;
    private int birthdayMonth;
    private int birthdayYear;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getBirthdayDay() {
        return birthdayDay;
    }

    public int getBirthdayMonth() {
        return birthdayMonth;
    }

    public int getBirthdayYear() { return birthdayYear; }
}
