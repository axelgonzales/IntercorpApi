package com.intercorp.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.intercorp.controller.response.KpiClient;
import com.intercorp.domain.Client;
import com.intercorp.repository.ClientRepository;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Repository
public class ClientRepositoryImpl implements ClientRepository {
	
	private JdbcTemplate jdbcTemplate;

    @Autowired
    public ClientRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
	    
	@Override
	public void create(Client client) {

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(this.jdbcTemplate.getDataSource())
                .withProcedureName("client_insert");
		
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("p_first_name", client.getFirstName());
        parameters.put("p_last_name", client.getLastName());
        parameters.put("p_bithdate", client.getBirthdate());
        parameters.put("p_old", client.getOld());

        Map<String, Object> result = simpleJdbcCall.execute(parameters);
        

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
