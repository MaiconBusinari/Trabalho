package Funcionario;

import java.util.Scanner;

public class ApresentandoOpcao {

	public static int Apresentando(String titulo) {
		int opcao;
		
		Scanner leitor = new Scanner(System.in);
		
		do {
			
			System.out.println("Informe o cardapio que deseja "+titulo+ " : ");
			System.out.println("1-Vinhos.");
			System.out.println("2-Bebidas.");
			System.out.println("3-Pratos");
						
			opcao=leitor.nextInt();
			
		}while(opcao !=1 && opcao !=2 && opcao !=3);
	
		return opcao;
	}
	
}
