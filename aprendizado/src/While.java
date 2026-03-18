package aprendizado.src;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // estrutura de repetição que executa um bloco de comandos
        // enquanto uma condição for verdadeira.

        // quando usar: quando não se sabe previamente a quantidade de
        // repetições que será realizada.

        // while(*condição verdadeira){
        // bloco repetido
        // }


//        exercicio1();
        exercicio2();
    }

    public static void exercicio1() {
        // problema: Fazer um programa que lê números
        //inteiros até que um zero seja lido. Ao
        //final mostra a soma dos números lidos.

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");

        int number = sc.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number;

            System.out.print("Informe um número: ");
            number = sc.nextInt();
        }

        System.out.println("soma " + sum);

        sc.close();
    }

    public static void exercicio2(){
        // usuário deve digitar a senha válida para encerrar o programa.

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a senha: ");
        int password = sc.nextInt();
        int validPassword = 2002;

        while(password != validPassword){
            System.out.println("Senha inválida");
            System.out.print("Informe a senha: ");
            password = sc.nextInt();
        }

        System.out.println("Acesso permitido");
    }
}