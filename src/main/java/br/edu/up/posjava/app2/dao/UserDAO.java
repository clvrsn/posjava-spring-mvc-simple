package br.edu.up.posjava.app2.dao;

import org.springframework.stereotype.Repository;

import br.edu.up.posjava.app2.entities.User;

@Repository
public class UserDAO {

	public void save(User user) {
		// Salvar usu�rio JDBC
	}

	public boolean validatePassword(User user) {

		// Validar senha do usu�rio no banco de dados
		return true;

	}

}
