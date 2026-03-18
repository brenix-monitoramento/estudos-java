package aprendizado.src;
import java.util.Scanner;

public class DoWhile{
    public static void main(String[] args) {
        // laço do while executa um bloco de comandos pelo
        // menos uma vez, pois a condição é verificada no final.

        //do {
        // bloco de comandos
        // } while (*condição);

        exercicio();
    }

    public static void exercicio(){
        // somar números enquanto a entrada para continuar for "s".

        Scanner sc = new Scanner(System.in);
        int number;
        char condition;
        int sum = 0;

        do {
            System.out.print("Informe um número: ");
            number = sc.nextInt();

            System.out.print("Deseja continuar? ");
            condition = sc.next().charAt(0);

            sum += number;
        } while (condition == 's');

        System.out.println("Soma " + sum);
    }
}