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
@RequestMapping(value = "/alunos")
public class AlunoResource {

	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> findAll(){
		return ResponseEntity.ok().body(alunoService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Aluno>> findById(@PathVariable int id){
		return ResponseEntity.ok().body(alunoService.findById(id));
	}
}
