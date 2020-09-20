package Funcionario;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import Trabalho.ApresentandoCardapio;
import Trabalho.Cardapios;

public class DeletandoItens {

	public static void Delentando(List<Cardapios> lista, String endereco,int verf){
		
String nomeNovo;String conv; Double precoNovo;int ver;
		
		do {
			ApresentandoCardapio.menu(lista);
			
			int cod;
			Scanner leitor = new Scanner(System.in);
			
			
			do {
				System.out.println("Informe o cod do produto que deseja deletar: ");
				cod = leitor.nextInt();				
				
			}while(cod<1||cod>lista.size());
		
			do {
				 System.out.println("Deseja confirmar a exclusao do iten de cod" + cod +"? (0 -> Não e 1 -> Sim) ");
				 ver = leitor.nextInt();				
				
			}while(ver !=0 && ver != 1);			
			
			if(ver==1) {
				
				lista.remove(cod-1);	
				
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
				 System.out.println("Deseja excluir mais 1 iten? (0 -> Não e 1 -> Sim) ");
				 ver = leitor.nextInt();				
				
			}while(ver !=0 && ver != 1);
			
		}while(ver != 0);
		
		
	}
}
