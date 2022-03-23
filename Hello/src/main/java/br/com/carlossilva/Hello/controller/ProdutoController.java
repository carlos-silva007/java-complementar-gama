package br.com.carlossilva.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlossilva.Hello.model.Produto;

@RestController
public class ProdutoController {
	
	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto p = new Produto(1212, "Computador DELL", 9500);
		return p;
	}
	@PostMapping("/produto")
	public String receberProduto(@RequestBody Produto p) {
		System.out.println("Produto Recebido" + p);
		return "OK";
	}
	

}
