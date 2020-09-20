package Clientes;

import java.util.List;
import java.util.Scanner;
import Trabalho.Cardapios;
import Trabalho.ApresentandoCardapio;

public class TipoDoPedido {

public static void Pedido(List<Cardapios> listaVinhos, List<Cardapios> listaBebidas, List<Cardapios> listaPratos ) {
		
		int opcao;int cod1=0;int cod2=0;int cod3=0;
		Comanda[] PedidoVinho = null;Comanda[] PedidoBebidas = null;Comanda[] PedidoPratos = null;
		Scanner leitor =  new Scanner(System.in);
		do {
			
			
				do {
					
					System.out.println("Escolha uma opção a baixo:");
					System.out.println("1-Vinhos.");
					System.out.println("2-Bebidas.");
					System.out.println("3-Pratos.");
					System.out.println("4-finalizar Pedido.");					
					opcao=leitor.nextInt();
					
				}while(opcao !=1 && opcao !=2 && opcao !=3 && opcao !=4);
				
				switch (opcao) {
			
				
				case 1 : {		
					ApresentandoCardapio.menu(listaVinhos,"Vinhos");
					PedidoVinho = EscolhendoItensDoCardapio.calculo(listaVinhos );
					cod1+=1;					
					break;
				}
				case 2 : {
					ApresentandoCardapio.menu(listaBebidas,"Bebidas");
					PedidoBebidas = EscolhendoItensDoCardapio.calculo(listaBebidas);
					cod2+=1;
					break;
				}
				case 3 : {
					ApresentandoCardapio.menu(listaPratos,"Pratos");
					PedidoPratos = EscolhendoItensDoCardapio.calculo(listaPratos);
					cod3+=1;
					break;
				}
				case 4 : {
					
					PedidoFinalizado.PedidoPronto(cod1, cod2, cod3, PedidoVinho, PedidoBebidas, PedidoPratos);
					break;
				}
				}			
				
		}while(opcao !=4);	
		leitor.close();
				
	}
	
}
