package aprendizado.src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {
            String[] vector = sc.nextLine().split(" ");
            int vectorPosition = sc.nextInt();

            System.out.println(vector[vectorPosition]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
        } catch (InputMismatchException e) {
            System.out.println("Invalid vector position");
        }

        System.out.println("End");
    }
}
