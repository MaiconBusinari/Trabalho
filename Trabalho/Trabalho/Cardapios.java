package Trabalho;

public class Cardapios {

	private int cod;
	private String nome;
	private Double preco;
	
	
//=================================================
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
//=================================================	
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
//=================================================

	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
//=================================================

	public static String getVinhos() {
		return "E:\\Aulas\\Desemvolvimento de Software 1\\Trabalho\\vinhos-tabulados.txt";
	}
	public static String getBebidas() {
		return "E:\\Aulas\\Desemvolvimento de Software 1\\Trabalho\\bebidas-tabuladas.txt";
	}
	public static String getPratos() {
		return "E:\\Aulas\\Desemvolvimento de Software 1\\Trabalho\\pratos.txt";
	}
			
}
