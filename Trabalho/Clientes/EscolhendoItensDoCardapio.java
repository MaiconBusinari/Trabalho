package Clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Trabalho.Cardapios;
import Clientes.Comanda;
import Clientes.AdicionandoItensAComanda;

public class EscolhendoItensDoCardapio {

	public static Comanda[] calculo(List<Cardapios> lista) {
		int opcao;int qtde=0;int conf; int confBeb;
		List<Integer> codP = new ArrayList<>();
		List<Integer> qtdeP = new ArrayList<>();
		
		System.out.println("");
		
		Scanner leitor = new Scanner(System.in);
		
		
		do {
			
			//=========================================================================
			
			do {
					System.out.println("Informe o codigo do produto que deseja:");
					opcao=leitor.nextInt();
					while(opcao<0 || opcao>lista.size()){
						System.out.println("O codigo do produto está incorreto, digite novamente:");
						opcao=leitor.nextInt();
					}	
					
					//=========================================================================
					
				 	if(opcao == 0) {
					 	confBeb=1;
					 	conf=0;	
					 	
				 	}
				 	else {

				 	//=========================================================================
						
							System.out.println("Informe a quantidade:");
							qtde=leitor.nextInt();
							while(qtde<1) {
								System.out.println("Informe uma quantidade valida:");
								qtde=leitor.nextInt();
							}
						
					//=========================================================================
					
							do{
								System.out.println("Deseja confirmar a opção?(0 -> Não e 1 -> Sim)");
								confBeb=leitor.nextInt();	
							}while(confBeb != 0 && confBeb != 1);							
													
							if(confBeb==1) {
								codP.add(opcao);
								qtdeP.add(qtde);	
							}
											
					//=========================================================================
							
							do{
								System.out.println("Deseja pedir mais(0 -> Não e 1 -> Sim)");
								conf=leitor.nextInt();	
							}while(conf != 0 && conf != 1);
						
					//=========================================================================
									
				 	}
				 	 	
				}while(confBeb==0);
					
		}while(conf==1);
		
		
		Comanda[] pedido = AdicionandoItensAComanda.PComandas(lista, codP, qtdeP);
		
		codP.clear();
	 	qtdeP.clear();
	 	
	 	return pedido;
	}
	
}
