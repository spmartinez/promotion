package com.sales.market.model;

import javax.persistence.Entity;

@Entity
public class Promotion extends ModelBase{
    private String description;

    public String getDescription() {
        return description;
    }
}
