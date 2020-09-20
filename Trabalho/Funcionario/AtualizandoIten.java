package Funcionario;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import Trabalho.ApresentandoCardapio;
import Trabalho.Cardapios;

public class AtualizandoIten {
	
	public static void Atualizando(List<Cardapios>  lista, int verf, String endereco){
		String nomeNovo;String conv; Double precoNovo;int ver;
		
		do {
			ApresentandoCardapio.menu(lista);
			int cod;
			Scanner leitor = new Scanner(System.in);
			
			
			do {
				System.out.println("Informe o cod do produto que deseja atualizar: ");
				cod = leitor.nextInt();				
				
			}while(cod<1||cod>lista.size());
			
			Scanner leitor2 = new Scanner(System.in);
			System.out.println("Informe o novo nome do iten: ");
			nomeNovo=leitor2.nextLine();
			
			System.out.println("Informe o novo preco do iten: ");
			conv=leitor2.nextLine();
			conv = conv.replace(",", ".");
			precoNovo = Double.parseDouble(conv);
			
			do {
				 System.out.println("Deseja confirmar a atualização? (0 -> Não e 1 -> Sim) ");
				 ver = leitor2.nextInt();				
				
			}while(ver !=0 && ver != 1);			
			
			if(ver==1) {
				
				lista.get(cod-1).setNome(nomeNovo);
				lista.get(cod-1).setPreco(precoNovo);				
				
				try {
					FileWriter arquivo = new FileWriter(endereco);
					PrintWriter gravador = new PrintWriter(arquivo);
					
					if(verf==0) {
						gravador.println("PRECO	BEBIDA");
					}
					else {
						gravador.println("PRATO;PRECOS");
					}
					
					int cont=0;
					for(Cardapios Cardapio : lista) {
						
						if(verf==0) {
							gravador.println(lista.get(cont).getPreco()+"	"+lista.get(cont).getNome());
						}
						else {
							gravador.println(lista.get(cont).getNome()+";"+lista.get(cont).getPreco());
						}
						cont++;
						
					}
					gravador.close();
					arquivo.close();
				} catch (IOException e) {
					System.out.println("O arquivo não foi encontrado");
				}
				
			}
			
			do {
				 System.out.println("Deseja atualizar mais 1 iten? (0 -> Não e 1 -> Sim) ");
				 ver = leitor.nextInt();				
				
			}while(ver !=0 && ver != 1);
			
		}while(ver != 0);
		
	}

}
