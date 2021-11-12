package exerciciosInventados;

import java.util.Scanner;

public class DesafioProvaArray { 
	
	// 4 perguntas, 3 alternativas, se acertar vale 2,5 se errar vale 0, passsando por arrays, por fim imprima a nota do aluno, se maior que 7 parabenize, senao ofenda
	//
	
	public static void main(String[] args) {
		
		final int qtdeDelacos = 1;
		final int respostaErrada = 0;
		double somaNota =0 ;
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < qtdeDelacos; i++) {
			        System.out.println("Qual a maior estrela do nosso sistema solar?\n\n ");
			             System.out.println("A - LUA  | B - METEORO | C - SOL | D - AVIÃO  |>");
			                 System.out.println("_______________________________________________");
			                 
			                  System.out.print("R: ");
			                  if(entrada.next().equalsIgnoreCase("C")) {
			                	  somaNota += 2.5;
			                  } 
			                  
			                       System.out.println("Passarinho que come pedra sabe o .. que tem (complete a frase).\n\n ");
			                               System.out.println("A - BICO  | B - PÉ | C - DENTE | D - CÚ  |>");
			                                   System.out.println("_______________________________________________");
			                  
			                                   System.out.print("R: ");
			                                    if(entrada.next().equalsIgnoreCase("D")) {
			                	                 somaNota += 2.5;
			                                  } 
			                                    
			               System.out.println("Quantas copas do mundo tem o Brasil?\n\n ");
			                 System.out.println("A - 11  | B - 4 | C - PELÉ | D - 5 |>");
			                   System.out.println("_______________________________________________");
			                                    
			                        System.out.print("R: ");
			                        if(entrada.next().equalsIgnoreCase("D")) {
			                      	somaNota += 2.5;
			                     } 
			                    
			           System.out.println("Qual dupla sertaneja canta a música evidências??\n\n ");
	                     System.out.println("A - Zezé di Camargo e Luciano  | B - Chitãozinho e Chororó | C - Latino e Parangolé | D - Patati e Patatá |>");
			               System.out.println("_______________________________________________");
			                        
			                        System.out.print("R: ");
			                        if(entrada.next().equalsIgnoreCase("B")) {
			                        	somaNota += 2.5;
			                        } if(somaNota >= 7.0 && somaNota <= 10.0) {
			                        	System.out.printf("Parabéns você tirou %.1f",somaNota);
			                        	
			                        } else {
			                        	System.out.println("REPROVADO!");
			                        }
		}
		
		
		entrada.close();
		
	}
}