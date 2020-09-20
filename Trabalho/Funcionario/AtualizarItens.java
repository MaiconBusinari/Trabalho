package Funcionario;

import java.util.List;
import Trabalho.ApresentandoCardapio;
import Trabalho.Cardapios;

public class AtualizarItens {

	public static void Atualizar(List<Cardapios> listaVinhos, List<Cardapios> listaBebidas, List<Cardapios> listaPratos) {
		
		int opcao = ApresentandoOpcao.Apresentando("Atualizar");
		
		switch (opcao) {
			
			case 1 : {
				
				AtualizandoIten.Atualizando(listaVinhos ,0 ,Cardapios.getVinhos());
							
				break;
			}
			
			case 2 : {
				AtualizandoIten.Atualizando(listaBebidas ,0 ,Cardapios.getBebidas());
				break;
			}
			
			case 3 : {
				AtualizandoIten.Atualizando(listaPratos ,1 ,Cardapios.getPratos());
				break;
			}
		}
		
	}
	
}
