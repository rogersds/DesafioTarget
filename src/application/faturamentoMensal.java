package application;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class faturamentoMensal {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub


		Locale.setDefault(Locale.US);
		
		System.out.println("Importando o arquivo para o Eclipse...");
		
		
		
		FileReader leitor = new FileReader("dados.json");
		JsonArray dados = JsonParser.parseReader(leitor).getAsJsonArray();
		
		System.out.println("Armazendo o faturamento em um Array");
		List<Double> faturamento = new ArrayList<>();
		
		
		// percorrendo o array e buscando cada elemento através do índice
		for (int i = 0; i < dados.size(); i++) {
			JsonObject dia = dados.get(i).getAsJsonObject();
			double valor = dia.get("valor").getAsDouble();
			
			
			if(valor > 0) {
				faturamento.add(valor);
			}
			else {
				System.out.println("Valor igual a 0! Desconsiderado!");
			}
			
		}
		
		System.out.println("Exibindo os valores maiores que 0: ");
		System.out.println("FATURAMENTO:" + faturamento);
		System.out.println();
		
		// Encontrando maior e menor valor na lista atualizada 
		
		double maior = faturamento.get(0);
		double menor = faturamento.get(0);
		double total = 0.0;
		
		for (int i = 0; i < faturamento.size(); i++) {
			double valor = faturamento.get(i);
			
			if(valor > maior) {
				maior = valor;			
			}
			
			else if(valor < menor) {
				menor = valor;
			}
			
			total+= valor;
		}
		
		System.out.println("Maior faturamento: "+ maior);
		System.out.println("Menor faturamento: "+ menor);
		System.out.println("Total de faturamento: "+ total);
		
		//Calculando a média do faturamento
		
		double media = total / faturamento.size();
		System.out.println("Média do Faturamento: "+ String.format("%.4f", media));
		
		// dias que bateram a média do mês
		
		int qtdeDiasBateu = 0;
		
		for (int i =0; i < faturamento.size(); i++) {
			double valor = faturamento.get(i);
			
			if(valor > media) {
				qtdeDiasBateu += 1;
			}
			
		}
		
		System.out.println("Quantidade de dias que bateram a meta: "+ qtdeDiasBateu);
	}
}
