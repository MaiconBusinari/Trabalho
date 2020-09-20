package Trabalho;
import java.io.FileNotFoundException;
import Clientes.TipoDoPedido;
import Funcionario.TipoDeOperacao;

import java.util.List;
import java.util.Scanner;

public class Trabalho {

	public static void main(String[] args) throws FileNotFoundException {
		
		List<Cardapios> ListaVinhos = EntradaDeCardapios.Cardapio(Cardapios.getVinhos(),0 ,1 ,"	");
		List<Cardapios> ListaBebidas = EntradaDeCardapios.Cardapio(Cardapios.getBebidas(),0 ,1 ,"	");
		List<Cardapios> ListaPratos = EntradaDeCardapios.Cardapio(Cardapios.getPratos() ,1 ,0 ,";");
		
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("Escolha sua opção");
			System.out.println("1- Funcionário");
			System.out.println("2- Cliente");
			opcao=leitor.nextInt();
		}while(opcao !=1 && opcao !=2);
		
		switch(opcao) {
		
			case 1 : {
				TipoDeOperacao.Operacao(ListaVinhos, ListaBebidas, ListaPratos);
			}
		
			case 2 : {
				TipoDoPedido.Pedido(ListaVinhos, ListaBebidas, ListaPratos);
			}
		}
	
		
	}

}
