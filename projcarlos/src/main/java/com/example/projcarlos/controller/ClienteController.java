package com.example.projcarlos.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projcarlos.dao.ClienteDao;
import com.example.projcarlos.model.Cliente;

@RestController
public class ClienteController {

	@Autowired
	private ClienteDao daocl;

	@GetMapping("/clientes")
	public ArrayList<Cliente> recuperarTudo() {
		ArrayList<Cliente> lista;
		lista = (ArrayList<Cliente>) daocl.findAll();
		return lista;
	}

}
