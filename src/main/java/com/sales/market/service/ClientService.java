package com.sales.market.service;

import com.sales.market.model.Client;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ClientService extends GenericService<Client> {
    List<Client> getBirthdayBoys();
}

