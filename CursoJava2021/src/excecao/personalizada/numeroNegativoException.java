package excecao.personalizada;

@SuppressWarnings("serial")
public class numeroNegativoException extends RuntimeException { 
	
	private String nomeDoAtributo;
	
	public numeroNegativoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo %s está negativo",
				nomeDoAtributo);
		
		
		
		
		
	}

}
