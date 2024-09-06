package application;

import java.util.Scanner;

public class InverterFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um frase :");
		String frase = sc.nextLine();
		String FraseInvertida = "";
		
		for(int i = frase.length()-1; i >= 0; i--) {
			FraseInvertida += frase.charAt(i);
			
		}
		
		System.out.println(FraseInvertida);
		
		sc.close();
	}

}
