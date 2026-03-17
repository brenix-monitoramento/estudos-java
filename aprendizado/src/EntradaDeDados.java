package aprendizado.src;
import java.util.Scanner;

public class EntradaDeDados{
    public static void main(String[] args){
        // o scanner é utilizado para a entrada de dados no Java
        Scanner sc = new Scanner(System.in);

        // lê string
        String x = sc.next();
        System.out.println("string is: " + x);

        // lê número inteiro
        int myInt = sc.nextInt();
        System.out.println("int is: " + myInt);

        // lê número flutuante
        double myDouble = sc.nextDouble();
        System.out.println("double is: " + myDouble);

        // lê char
        char y = sc.next().charAt(0);
        System.out.println("my char is: " + y);

        sc.close();
    }
}
