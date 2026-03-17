public class Main{
    public static void main(String[] args){
        System.out.println("Olá mundo!");

        bool();
    }

    public static void bool(){
        int x = 23;
        double y = 45.67;

        String output = (y < x) ? "Olá" : "Mundo";
        System.out.println("Result " + output);
    }
}