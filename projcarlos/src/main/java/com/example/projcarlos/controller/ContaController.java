package com.example.projcarlos.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projcarlos.dao.ContaDao;
import com.example.projcarlos.model.Conta;

@RestController
public class ContaController {

	@Autowired
	private ContaDao dao;

	@GetMapping("/contas")
	public ArrayList<Conta> recuperarTudo() {
		ArrayList<Conta> lista;
		lista = (ArrayList<Conta>)dao.findAll();
		return lista;
	}

}
