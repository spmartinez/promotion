package com.sales.market.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PromotionServiceImplTest {

    @Value("${blackDays}")
    private String blackDay;

    @Autowired
    private PromotionService promotionService;

    @Test
    void sendBirthdayMessage() {

        ArrayList<String> expectedResponse = new ArrayList<>();
        expectedResponse.add("Silvia Martinez");
        expectedResponse.add("Fernando Perez");

        List<String> response = this.promotionService.sendBirthdayMessage(1L);

        assertEquals(response, expectedResponse);
    }
    @Test
    void sendMessageBlackDay() {

        ArrayList<String> expectedResponse = new ArrayList<>();
        expectedResponse.add("Silvia Martinez");
        expectedResponse.add("Fernando Perez");

        this.promotionService.setDiscount(blackDay);

        List<String> response = this.promotionService.sendBirthdayMessage(1L);

        assertEquals(response, expectedResponse);
    }


}