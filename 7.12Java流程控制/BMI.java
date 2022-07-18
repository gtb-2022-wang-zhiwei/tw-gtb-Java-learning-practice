import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your weight: ");
        double w = scanner.nextDouble();
        System.out.print("Input your height: ");
        double h = scanner.nextDouble();
        double s = w/(h*h);
        if (s > 28.0) {  
            System.out.println("fat");
        }else if (s > 25.0 ) {
            System.out.println("verweight");
        }else if (s > 18.5) {
            System.out.println("normal");
        }else  {
            System.out.println("too thin");
        }
    }
}