package br.com.agtechtafefa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agtechtafefa.exception.TransferResourceNotFoundException;
import br.com.agtechtafefa.model.TransferModel;
import br.com.agtechtafefa.repository.TransferRepository;

@Service
public class TransferServices {
	
	@Autowired
	TransferRepository repository;
		
	public TransferModel create(TransferModel agendamento) {
		return repository.save(agendamento);
	}
	
	public List<TransferModel> findAll() {
		return repository.findAll();
	}	
	
	public TransferModel findById(Long id) {

		return repository.findById(id)
				.orElseThrow(() -> new TransferResourceNotFoundException("No records found for this ID"));
	}
		
	public TransferModel update(TransferModel agendamento) {
		TransferModel entity = repository.findById(agendamento.getId())
				.orElseThrow(() -> new TransferResourceNotFoundException("No records found for this ID"));
		
		entity.setAccountOrigin(agendamento.getAccountOrigin());
		entity.setAccountDestiny(agendamento.getAccountDestiny());
		entity.setTransfDate(agendamento.getTransfDate());
		entity.setAppointmentDate(agendamento.getAppointmentDate());
		entity.setValtransf(entity.getValtransf());
		entity.setRateCalculated(agendamento.getRateCalculated());

		return repository.save(entity);
	}	
	
	public void delete(Long id) {
		TransferModel entity = repository.findById(id)
				.orElseThrow(() -> new TransferResourceNotFoundException("No records found for this ID"));
		repository.delete(entity);
	}

}
