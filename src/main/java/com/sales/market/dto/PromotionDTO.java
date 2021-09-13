package com.sales.market.dto;

import com.sales.market.model.Promotion;

public class PromotionDTO extends DtoBase<Promotion> {
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }


}

