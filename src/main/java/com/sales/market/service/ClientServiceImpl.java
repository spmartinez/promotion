package com.sales.market.service;

import com.sales.market.model.Client;
import com.sales.market.repository.ClientRepository;
import com.sales.market.repository.GenericRepository;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class ClientServiceImpl extends GenericServiceImpl<Client> implements ClientService {
    private final ClientRepository repository;

    public ClientServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Client> getRepository() {
        return repository;
    }

    @Override
    public List<Client> getBirthdayBoys() {
        Calendar cal = Calendar.getInstance();
        return getBirthdayBoys(cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.MONTH) + 1);
    }

    private List<Client> getBirthdayBoys(int day, int month) {
        List<Client> res = this.repository.findBirthdayBoys(day, month);
        return res;
    }
}

