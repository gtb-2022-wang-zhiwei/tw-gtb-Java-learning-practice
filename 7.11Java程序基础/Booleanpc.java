import java.util.Scanner;
public class Booleanpc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whether you are a primary school student");
        System.out.print("Input your age: ");
        int a = scanner.nextInt();
        boolean isPriamryschoolstudent = a>=6 && a<=12;
        System.out.println(isPriamryschoolstudent);
    }
}