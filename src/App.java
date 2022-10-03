import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double s, h, t;

        System.out.println("digite seu salario e hora");
        s = sc.nextDouble();
        h = sc.nextDouble();

        t = s*h*20;

        System.out.println("Seu salario por mes e " + t);
    }
}
