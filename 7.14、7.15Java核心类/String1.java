public class String1 {
    public static void main(String[] args) {
        String s = "Hi %s, your score is %d!";
        System.out.println(String s.formatted("Alice", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));
    }
}
