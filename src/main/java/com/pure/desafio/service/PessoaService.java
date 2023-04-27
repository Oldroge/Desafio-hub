package com.pure.desafio.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.pure.desafio.connection.JDBCConnection;
import com.pure.desafio.model.Pessoa;

@Service
public class PessoaService {
  ArrayList<Pessoa> todasPessoas = new ArrayList<>();
  private JDBCConnection connection;

  public PessoaService() {
    this.connection = new JDBCConnection();
  }

  public ArrayList<Pessoa> findAll() {
    try {
      Statement statement = connection.getConnection().createStatement();
      ResultSet result = statement.executeQuery("select * from pure.Pessoas");
      ArrayList<Pessoa> todasPessoas = new ArrayList<>();

      while (result.next()) {
        String name = result.getString("nome");
        String email = result.getString("email");
        String phoneNumber = result.getString("telefone");
        String profession = result.getString("profissao");
        Pessoa pessoa = new Pessoa(name, email, phoneNumber, profession);
        todasPessoas.add(pessoa);
      }
      return todasPessoas;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public Pessoa addNewPessoa(Pessoa novaPessoa) {
    try {
      Connection connect = connection.getConnection();
      PreparedStatement statement = connect.prepareStatement(
          "insert into pure.Pessoas(nome, email, telefone, profissao) " + "values(?, ?, ?, ?)",
          Statement.RETURN_GENERATED_KEYS);

      statement.setString(1, novaPessoa.getNome());
      statement.setString(2, novaPessoa.getEmail());
      statement.setString(3, novaPessoa.getTelefone());
      statement.setString(4, novaPessoa.getProfissao());

      int inserted = statement.executeUpdate();
      if (inserted > 0) {
        ResultSet result = statement.getGeneratedKeys();
        if (result.next()) {
          novaPessoa.setId(result.getInt(1));
        }
      }
      return novaPessoa;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      connection.closeConnection();
    }
    return null;
  }

}
