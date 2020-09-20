package Trabalho;

import java.util.List;

public class ApresentandoCardapio {

	public static void menu(List<Cardapios> listaVinhos, String tipo) {
		
		System.out.println("\t\t MENU");
		System.out.println("Cod \t\tPreço\t        Opção");
		System.out.println("");
		System.out.println("0  \t\t------\t\tCancelar "+tipo);
		
		for (int i=0; i<listaVinhos.size();i++) {
			
			int cod = listaVinhos.get(i).getCod();
			String nome = listaVinhos.get(i).getNome();
			Double valor = listaVinhos.get(i).getPreco();
					
			System.out.println(cod + "\t\tR$" + valor + "\t\t" + nome);
	
		}
			
	}

	public static void menu(List<Cardapios> lista) {
		

		System.out.println("\t\t MENU");
		System.out.println("Cod \t\tPreço\t        Opção");
		System.out.println("");
		
		for (int i=0; i<lista.size();i++) {
			
			int cod = lista.get(i).getCod();
			String nome = lista.get(i).getNome();
			Double valor = lista.get(i).getPreco();
					
			System.out.println(cod + "\t\tR$" + valor + "\t\t" + nome);
	
		}
		
	}
	
}
