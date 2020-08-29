package com.jhaFinancial.ClientApp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jhaFinancial.ClientApp.model.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client, String>{
	
	public Client findByName(String name);
	public List<Client> findByMaritalStatus(String maritalStatus);

}
