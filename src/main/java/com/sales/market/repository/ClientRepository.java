package com.sales.market.repository;

import com.sales.market.model.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends GenericRepository<Client> {
    @Query("select client from Client client where client.birthdayDay = :day and client.birthdayMonth = :month")
    List<Client> findBirthdayBoys(@Param("day") int day, @Param("month") int month);

}

