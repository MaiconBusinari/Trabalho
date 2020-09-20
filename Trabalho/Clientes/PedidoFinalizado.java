package Clientes;

import java.util.Scanner;

public class PedidoFinalizado {

	public static void PedidoPronto(int cod1, int cod2, int cod3, Comanda[] PedidoVinho, Comanda[] PedidoBebidas, Comanda[] PedidoPratos){
		
		String obs; double total=0;
		
		Scanner leitor = new Scanner(System.in);	
		System.out.println("Digite uma observação:");
		obs=leitor.nextLine();			

		System.out.println("\t\tComanda Final\n");
		System.out.println("Quant\tPreço\tTotal\tNome");
		
		if(cod1==1) {
			total+=ImprimindoComanda.Finalizado(PedidoVinho);
		}
		if(cod2==1) {
			total+=ImprimindoComanda.Finalizado(PedidoBebidas);
		}
		if(cod3==1) {
			total+=ImprimindoComanda.Finalizado(PedidoPratos);
		}	
		System.out.println("Obsevação do cliente: " + obs);
		System.out.println("o total do pedido foi: " + total);
		
		
		
	}
	
}
