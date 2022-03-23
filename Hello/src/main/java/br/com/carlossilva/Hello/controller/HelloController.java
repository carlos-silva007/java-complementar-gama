package br.com.carlossilva.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/teste")
	public String digaOla() {
		return "Vamos verificar o DevTools Rodando!!!";
	}

}
