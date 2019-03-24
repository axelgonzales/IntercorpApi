package com.intercorp.servicie.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intercorp.controller.response.KpiClient;
import com.intercorp.domain.Client;
import com.intercorp.repository.ClientRepository;
import com.intercorp.servicie.ClientService;


@Service
@Transactional
public class ClientServiceImpl  implements ClientService{
	
	private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
	
	@Override
	public void create(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public KpiClient findKpi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
