package jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExclusaoPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o codigo da pessoa para deletar: ");
		int codigo = scan.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso!! ");
		} else {
			System.out.println("Nada aconteceu!");
		}
		
		
		conexao.close();
		scan.close();
	}

}
