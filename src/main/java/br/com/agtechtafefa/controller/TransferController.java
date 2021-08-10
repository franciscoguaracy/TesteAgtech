package br.com.agtechtafefa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agtechtafefa.model.TransferModel;
import br.com.agtechtafefa.services.TransferServices;

@RestController
@RequestMapping("/agtech")
public class TransferController {
	
	@Autowired
	private TransferServices service;
	
	@GetMapping
	public List<TransferModel> findAll() {
		return service.findAll();
	}	
	
	@GetMapping("/{id}")
	public TransferModel findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}	
	
	@PostMapping
	public TransferModel create(@RequestBody TransferModel agendamento) {
		return service.create(agendamento);
	}
	
	@PutMapping
	public TransferModel update(@RequestBody TransferModel agendamento) {
		return service.update(agendamento);
	}	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}	
	
}