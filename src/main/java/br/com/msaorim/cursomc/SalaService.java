package br.com.msaorim.cursomc;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService {

	@Autowired
	private SalaRepository salaRepository;
	
	public List<Sala> findAll(){
		return salaRepository.findAll();
	}
	
	public Optional<Sala> findById(int id){
		return salaRepository.findById(id);
	}
}
