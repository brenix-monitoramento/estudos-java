public class Main {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");

        result();
    }

    public static void result() {
        int x = 23;
        double y = 45.67;

        String output = (y < x) ? "Olá" : "Mundo";
        System.out.println("Result " + output);
    }
}