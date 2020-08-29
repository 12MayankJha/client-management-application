package com.jhaFinancial.ClientApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.jhaFinancial.ClientApp.model.Client;
import com.jhaFinancial.ClientApp.service.ClientService;

@RestController
public class clientController {

	@Autowired
	private ClientService clientService;

	@GetMapping("/get")
	public Client get(@RequestParam String name) {
		return clientService.getByName(name);
	}

	@GetMapping("/getAll")
	public List<Client> getAll() {
		return clientService.getAllClient();
	}
	
	@PutMapping("/createOrUpdate")
	public Client createOrUpdate(@RequestBody Client client) {
		return clientService.createOrUpdate(client);
	}

	@DeleteMapping("/delete")
	public String delete(@RequestParam String name) {
		clientService.delete(name);
		return "deleted " + name;
	}

	@DeleteMapping("/deleteAll")
	public String deleteAll() {
		clientService.deleteAll();
		return "deleted All Records";
	}

}
