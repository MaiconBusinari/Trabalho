package Funcionario;

import java.util.List;

import Trabalho.ApresentandoCardapio;
import Trabalho.Cardapios;

public class DeletarItens {

	public static void Deletar(List<Cardapios> listaVinhos, List<Cardapios> listaBebidas, List<Cardapios> listaPratos) {
		
		int opcao = ApresentandoOpcao.Apresentando("Deletar");
		
		switch (opcao) {
			
			case 1 : {
				DeletandoItens.Delentando(listaVinhos, Cardapios.getVinhos(), 0);
				break;
			}
			
			case 2 : {
				DeletandoItens.Delentando(listaVinhos, Cardapios.getBebidas(), 0);

				break;
			}
			
			case 3 : {
				DeletandoItens.Delentando(listaVinhos, Cardapios.getPratos(), 1);

				break;
			}
		}
		
	}
	
}
