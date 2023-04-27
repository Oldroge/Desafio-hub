package com.pure.desafio.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.pure.desafio.model.Pessoa;
import com.pure.desafio.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

  @Autowired
  PessoaService pessoaService;
  Gson gson;

  public PessoaController() {
    this.pessoaService = new PessoaService();
    this.gson = new Gson();
  }

  @GetMapping
  public String findAll() {
    ArrayList<Pessoa> todasPessoas = this.pessoaService.findAll();
    return this.gson.toJson(todasPessoas);
  }

  @PostMapping
  public ResponseEntity<Pessoa> addNewPessoa(@RequestBody Pessoa novaPessoa) {
    return ResponseEntity.ok().body(pessoaService.addNewPessoa(novaPessoa));
  }

}
