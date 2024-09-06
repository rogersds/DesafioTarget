package application;

import java.util.Scanner;

public class DesafioFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		int a = 0;
		int b = 1;
		
		if (num == 0 || num == 1) {
			System.out.printf(" O número %d pertence a sequência de Fibonacci", num);
		}
		// somando até que que o numero seja maior ou igual ao informado
		
		while (b < num) {
		
			int temp = b;
			b = a + b;
			a = temp;
			 System.out.println(b);
		}
		
		// verificando se o número pertence a sequencia de FIbo 
		
		if (b == num) {
			System.out.println("Pertence a sequência de Fibonacci");
		}
		else {
			System.out.println("Não pertence a sequência de Fibonacci.");
		}

		sc.close();
	}

}
