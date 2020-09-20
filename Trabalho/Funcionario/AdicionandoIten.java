package Funcionario;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import Trabalho.ApresentandoCardapio;
import Trabalho.Cardapios;

public class AdicionandoIten {

	public static void Adicionando(List<Cardapios> lista, String titulo, String endereco, int cod)	{
		String conv;int opcao;
		
		Scanner leitor = new Scanner(System.in);
		
		do {
			
			ApresentandoCardapio.menu(lista);			
			
			Cardapios iten = new Cardapios();
			
			System.out.println("Informe o nome do " +titulo+ " que deseja cadastras: ");
			iten.setNome(leitor.nextLine());
			
			System.out.println("Informe o preço do " +titulo+ " que deseja cadastras: ");
			conv=leitor.nextLine();
			
			conv = conv.replace(",", ".");
			iten.setPreco(Double.parseDouble(conv));
			
			iten.setCod(lista.size()+1);
			
			Scanner leitor2 = new Scanner(System.in);
			do {
				System.out.println("Deseja confirmar a adição do iten?(0 -> Não e 1 -> Sim)");
				opcao = leitor2.nextInt();
			}while(opcao != 0 && opcao != 1);	
			
			if(opcao==1) {
				try {
					FileWriter arquivo = new FileWriter(endereco, true);
					PrintWriter gravador = new PrintWriter(arquivo);
					if(cod==0) {
						gravador.println(iten.getPreco()+"	"+iten.getNome()+"");
						System.out.println("Gravou.");
						
					}
					else {
						gravador.println(iten.getNome()+";"+iten.getPreco()+"");
						System.out.println("Gravou.");
					}
					
					gravador.close();
					arquivo.close();
					
				} catch (IOException e) {
					System.out.println("Arquivo nao encontrado");
				}
			}
			
			do {
				System.out.println("Deseja adicionar mais iten?(0 -> Não e 1 -> Sim)");
				opcao = leitor2.nextInt();
			}while(opcao != 0 && opcao != 1);
			
		
			
		}while(opcao != 0);	
	}	
}
