package desafios;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Cadastre uma senha numerica: ");
        int senhaMestre = ler.nextInt();

        double soma = 0;
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite um número: ");
            soma += ler.nextDouble();
        }

        System.out.print("Digite a senha para desbloquear a soma: ");
        int senhaTentativa = ler.nextInt();

        System.out.println(senhaTentativa == senhaMestre ? "A soma é " + soma : "Erro! Senha incorreta");

        ler.close();
    }
}
