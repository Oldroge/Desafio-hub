package com.pure.desafio.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * para criar a conexão usei essa referência:
 * https://www.devmedia.com.br/java-crie-uma-conexao-com-banco-de-dados/5698
 */

public class JDBCConnection {
  private Connection connection;
  String username = null;
  String password = null;
  String port = null;
  String url = null;

  public JDBCConnection() {
    this.username = "root";
    this.password = "12345678";
    this.port = "3306";

    this.url = "jdbc:mysql://localhost:" + port + "/pure";
  }

  public Connection getConnection() {
    try {
      return this.connection = DriverManager.getConnection(this.url, this.username, this.password);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;

  }

  public void closeConnection() {
    try {
      this.connection.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
