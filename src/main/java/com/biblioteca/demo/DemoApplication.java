package com.biblioteca.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Atendente p1 = new Atendente("Pedro", "123456", "654321", "pedro", "1234", 1000.0);

		// Endereco end1 = new Endereco("Petropolis");

		// p1.setEndereco(end1);

		// System.out.println(p1.getEndereco().getCidade());
		// System.out.println(p1.getCpf());

	
        System.out.println(p1.imprimeContraCheque());
     
		
	}

}


/* 
		* Livro - ok - ok
		* Autor - ok - ok
		* Endereco - ok - ok
		* Editora - ok - ok
		* Pessoa - ok - ok
		* Emprestimo - ok - ok
		* Exemplar - ok - ok
		* Devolucao - ok - ok
		* 
		*/