import java.util.Scanner;
public class Xiaoming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your last score: ");
        int a = scanner.nextInt();
        System.out.print("Input your score: ");
        int b = scanner.nextInt();
        double s = ((b - a)*100)/a;
        System.out.printf("Hi,xiaoming. your score have improved:%.2f%%",s);
    }
}