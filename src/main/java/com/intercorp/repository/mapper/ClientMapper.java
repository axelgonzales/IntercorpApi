package com.intercorp.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.intercorp.domain.Client;

public class ClientMapper implements RowMapper<Client> {

	@Override
	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		Client client = new Client();
		client.setFirstName(rs.getString("firstName"));
		client.setLastName(rs.getString("lastName"));
		client.setBirthdate(rs.getString("birthdate"));
		client.setOld(rs.getInt("old"));
		return client;
	}

}
