package Funcionario;

import java.util.List;
import java.util.Scanner;
import Trabalho.Cardapios;

public class TipoDeOperacao {

	public static void Operacao(List<Cardapios> listaVinhos, List<Cardapios> listaBebidas, List<Cardapios> listaPratos ) {
		int opcao;
		
		Scanner leitor =  new Scanner(System.in);
		do {
			do {
				
				System.out.println("Escolha uma operação a baixo: ");
				System.out.println("1-Adicionar.");
				System.out.println("2-Atualizar.");
				System.out.println("3-Deletar");	
				System.out.println("4-Finalizar");
				opcao=leitor.nextInt();
				
			}while(opcao !=1 && opcao !=2 && opcao !=3 && opcao !=4);
			
			switch (opcao) {
		
			
			case 1 : {		
						AdicionarItens.Adicionar(listaVinhos, listaBebidas, listaPratos);		
				break;
			}
			case 2 : {
						AtualizarItens.Atualizar(listaVinhos, listaBebidas, listaPratos);
				break;
			}
			case 3 : {
						DeletarItens.Deletar(listaVinhos, listaBebidas, listaPratos);
				break;
			}
			case 4 : {
				System.out.println("O programa foi finalizado.");
			}
			}		
		}while(opcao != 4);
		System.exit(0);
	}
	
}
