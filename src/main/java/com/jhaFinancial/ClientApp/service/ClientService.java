package com.jhaFinancial.ClientApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhaFinancial.ClientApp.model.Client;
import com.jhaFinancial.ClientApp.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public Client createOrUpdate(Client client) {
		return clientRepository.save(client);
	}
	
	public List<Client> getAllClient() {
		return clientRepository.findAll();	
	}
	
	public Client getByName(String name) {
		return clientRepository.findByName(name);	
	}
	
	public void deleteAll() {
		clientRepository.deleteAll();
	}
	
	public void delete(String name) {
	Client client = clientRepository.findByName(name);
	clientRepository.delete(client);
	}

}
