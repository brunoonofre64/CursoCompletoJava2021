package jbdc;

public class DAOTeste {
	
	public static void main(String[] args) {
		
		
		DAO dao = new DAO();
        
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		dao.incluir(sql, "Bruno Henrique");
		dao.incluir(sql, "Henrique Henrique");
		dao.incluir(sql, "Whashington Pereira");
		
		dao.close();
	}

}
