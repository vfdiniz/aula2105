package desafios;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        double numero = ler.nextDouble();

        System.out.println(numero % 5 == 0 
            ? "O número " + numero + " é multiplo de 5" 
            : "O número " + numero + " não é multiplo de 5");

        ler.close();
    }
}
