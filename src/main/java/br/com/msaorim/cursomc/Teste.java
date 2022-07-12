package br.com.msaorim.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Teste implements CommandLineRunner {

	@Autowired
	private AlunoRepository alunoRepository;
	@Autowired
	private SalaRepository salaRepository;
	@Override
	public void run(String... args) throws Exception {

		var s1 = new Sala(null, "1A");
		var s2 = new Sala(null, "1B");

		var a1 = new Aluno(null, "Joao", s1);
		var a2 = new Aluno(null, "Maria", s2);
		var a3 = new Aluno(null, "Pedro",s1);
		
		salaRepository.saveAll(Arrays.asList(s1, s2));
		alunoRepository.saveAll(Arrays.asList(a1, a2, a3));
	}

}
