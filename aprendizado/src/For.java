package aprendizado.src;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        // laço for é utilizado para quando se sabe previamente
        // a quantidade de repetições ou intervalo de valores.

        for (int i = 1; i < 6; i++) {
            System.out.println("valor de i: " + i);
        }

        exercicio();
    }

    public static void exercicio() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("valor de i: " + i);
        }
    }
}