package jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o codigo da pessoa: ");
		int codigo = scan.nextInt();
		
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		
		
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			
			System.out.println("O nome atual �: " + p.getNome());
			scan.nextLine();
			
			System.out.println("Informe um novo nome: ");
			String novoNome = scan.nextLine();
			
		
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			stmt.close();
			
			System.out.println("Pessoa alterada com sucesso! ");
		 } else {
			 System.out.println("Pessoa n�o encontrada... ");
		 }
		
		
		
		
		scan.close();
		conexao.close();
	}

}
