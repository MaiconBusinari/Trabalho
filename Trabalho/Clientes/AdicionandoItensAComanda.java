package Clientes;

import java.util.List;

import Trabalho.Cardapios;
import Clientes.Comanda;

public class AdicionandoItensAComanda {

	public static Comanda[] PComandas(List<Cardapios> lista, List<Integer> opcao, List<Integer> qtde ){	
		
		Comanda[] ComandaCompleta = new Comanda[opcao.size()];
		int posicao;
		
		for (int i=0; i<opcao.size(); i++) {
		
		 Comanda pedido = new Comanda();
		 posicao=opcao.get(i)-1;		
		 pedido.setNome(lista.get(posicao).getNome());
		 pedido.setQtde(qtde.get(i));
		 pedido.setPreco(lista.get(posicao).getPreco());
		 pedido.setTotal(pedido.getPreco()*pedido.getQtde());
		 
		 ComandaCompleta[i]=pedido;
	 }		 	
	 return ComandaCompleta;
	
}
	
}
