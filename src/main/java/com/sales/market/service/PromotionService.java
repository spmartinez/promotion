package com.sales.market.service;

import com.sales.market.model.Promotion;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface PromotionService extends GenericService<Promotion> {
    List<String> sendBirthdayMessage(Long idPromotion);
    void setDiscount(String discount);

}
