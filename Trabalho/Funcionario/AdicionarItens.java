package Funcionario;

import Trabalho.Cardapios;
import java.util.List;

public class AdicionarItens {

	public static void Adicionar(List<Cardapios> listaVinhos, List<Cardapios> listaBebidas, List<Cardapios> listaPratos) {
		int opcao;
		do {
			
			opcao = ApresentandoOpcao.Apresentando("Adiconar");
			
			switch (opcao) {
				
				case 1 : {
					AdicionandoIten.Adicionando(listaVinhos, "Vinhos" , Cardapios.getVinhos(), 0);
					break;
				}
				
				case 2 : {
					AdicionandoIten.Adicionando(listaBebidas, "Bebidas", Cardapios.getBebidas(), 0);
					break;
				}
				
				case 3 : {
					AdicionandoIten.Adicionando(listaPratos, "Pratos", Cardapios.getPratos(), 1);
					break;
				}
			}
		}while(opcao == 4);
		
	}
	
}
