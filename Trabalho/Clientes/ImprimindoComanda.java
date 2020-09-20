package Clientes;

public class ImprimindoComanda {

	public static double Finalizado(Comanda[] Pedido) { 
		//public static void Finalizado(Comanda[] PedidoVinho, Comanda[] PedidoBebidas, Comanda[] PedidoPratos) {
			double soma=0; String nome; int qtde; double preco; double total=0;
			
			
			
			for(int i=0;i<Pedido.length;i++) {
				
				nome = Pedido[i].getNome();
				qtde = Pedido[i].getQtde();
				preco = Pedido[i].getPreco();
				total = Pedido[i].getTotal();
				
				soma= soma+total;
				
				System.out.println(qtde+"\t"+preco+"\t"+total+"\t"+nome);
			
			}
			return soma;
	}
}