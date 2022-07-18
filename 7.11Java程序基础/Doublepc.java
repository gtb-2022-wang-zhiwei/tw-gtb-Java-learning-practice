import java.util.Scanner;
public class Doublepc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Calculating linear equation in two unknowns:ax^2+bx+c=0");
        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input c: ");
        double c = scanner.nextDouble();
        double x1 = (-b + Math.sqrt(b*b-4*a*c))/2*a;
        double x2 = (-b - Math.sqrt(b*b-4*a*c))/2*a;
        System.out.print("x1="+ x1);
        System.out.print("x2="+ x2);
    }
}