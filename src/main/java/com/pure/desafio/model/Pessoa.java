package com.pure.desafio.model;

public class Pessoa {
  private Long id;
  private String nome;
  private String email;
  private String telefone;
  private String profissao;


  public Pessoa(String nome, String email, String telefone, String profissao) {
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.profissao = profissao;
  }


  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public String getNome() {
    return nome;
  }


  public void setNome(String nome) {
    this.nome = nome;
  }


  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public String getTelefone() {
    return telefone;
  }


  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }


  public String getProfissao() {
    return profissao;
  }


  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }
}
