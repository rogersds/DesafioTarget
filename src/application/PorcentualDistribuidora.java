package application;

import java.util.Locale;

public class PorcentualDistribuidora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		double SP = 67836.43;
		double RJ = 36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double outros = 19849.53;
		
		double totalFaturamento = SP + RJ + MG + ES + outros;
		System.out.println("O total do faturamento foi de : " + totalFaturamento);
		
		System.out.println("Porcentual de cada Estado: ");
		
		double porcentualSP = (SP / totalFaturamento) * 100;
		double porcentualRJ = (RJ / totalFaturamento) * 100;
		double porcentualMG = (MG / totalFaturamento) * 100;
		double porcentualES = (ES / totalFaturamento) * 100;
		double porcentualoutros = (outros / totalFaturamento) * 100;
		
		System.out.println("O Porcentual de faturamento no estado de SP foi de " + String.format("%.2f%%", porcentualSP));
		System.out.println("O Porcentual de faturamento no estado de MG foi de " + String.format("%.2f%%", porcentualMG));
		System.out.println("O Porcentual de faturamento no estado de RJ foi de " + String.format("%.2f%%", porcentualRJ));
		System.out.println("O Porcentual de faturamento no estado de ES foi de " + String.format("%.2f%%", porcentualES));
		System.out.println("O Porcentual de faturamento no estado de outros foi de " + String.format("%.2f%%", porcentualoutros));


		

	}

}
