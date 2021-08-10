package br.com.agtechtafefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agtechtafefa.model.TransferModel;

@Repository
public interface TransferRepository extends JpaRepository<TransferModel, Long>{

}