import java.util.Locale;

public class Hello {
    public static void main(String[] args){
        // println adiciona quebra de linha
        System.out.println("Olá mundo, meu prodfdgrama Java");
        
        // print não adiciona quebra de linha
        System.out.println("segunda linha");

        int age = 22;
        String name = "Breno";

        System.out.println("my age is " + age + " and my name is " + name);

        //printf formata um valor de saída
        double myDouble = 34.567;
        // nesse caso estou formatando o double para 2 casas decimais
        System.out.printf("%.2f%n", myDouble);
        
        //já aqui sem formatação
        Locale.setDefault(Locale.US);
        System.out.printf("my number is %.2f%n", myDouble);

    }
}