public class Compare {
    public static void main(String[] args) {
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        System.out.println(x);
        System.out.println(y);
        double r = Math.abs(x - y);
        if (r < 0.00001) {
        System.out.println("x = y");
            } else {
        System.out.println("x&y are not equal");
}
    }
}