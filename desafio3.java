package desafios;

import java.util.Scanner;

public class desafio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int valor1 [] = new int[2];
		int valor2 [] = new int [2];
		int valor3 [] = new int [4];
		
	for (int i=0; i<2; i++) {
		System.out.println("Informe o" +i + "° valor..: ");
		valor1 [i] = ler.nextInt();
		valor3 [i] = valor1 [i]; 
		
	}
	for (int i =0; i<2; i++) {
		System.out.println("Informe o " + i + "° valor..:");
		valor2 [i] = ler.nextInt();
		valor3 [i+2] = valor2 [i];
		
	}

	
			for (int i =0; i<4; i++) {
				System.out.println("Informe o " + i + "° valor..:" + valor3[i]);
				
		
	}
			ler.close();
		
		
	}

}
