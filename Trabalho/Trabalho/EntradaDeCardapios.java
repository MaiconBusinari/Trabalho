package Trabalho;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaDeCardapios {
	
	public static List<Cardapios> Cardapio(String endereco, int prim, int seg, String separador) throws FileNotFoundException {
		
		List<String> linhas = new ArrayList<>();
		
		File arquivo = new File(endereco);
		Scanner leitor = new Scanner(new FileInputStream(arquivo), "UTF-8");
		leitor.nextLine();
		
		while(leitor.hasNext()) {
					
			linhas.add(leitor.nextLine());
			
		}
		 leitor.close();
		 
		 List<Cardapios> Cardapio = new ArrayList<Cardapios>();
		 //Cardapios[] Cardapio = new Cardapios[linhas.size()];
		 
		 for (int i=0; i<linhas.size(); i++) {
			
			 Cardapios opcao = new Cardapios();
			 String[] frag = linhas.get(i).split(separador);		
			 
			 
			 frag[prim]= frag[prim].replaceAll(",", ".");			
			 opcao.setPreco(Double.parseDouble(frag[prim]));
			 opcao.setNome(frag[seg]);
			 opcao.setCod(i+1);
			 
			 Cardapio.add(opcao);
		 }		 	
		 return Cardapio;
	}
}
