package br.com.msaorim.cursomc;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/salas")
public class SalaResource {

	@Autowired
	private SalaService salaService;
	
	@GetMapping
	public ResponseEntity<List<Sala>> findAll(){
		return ResponseEntity.ok().body(salaService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Sala>> findById(@PathVariable int id){
		return ResponseEntity.ok().body(salaService.findById(id));
	}
}
