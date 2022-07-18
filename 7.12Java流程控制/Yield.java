public class Main {
    public static void main(String[] args) {
        String fruit = "orange";
        int opt = switch (fruit) {
            case "apple":
            opt = 1;
            break;
            case "pear"
            case "mango":
            opt = 2;
            break;
            default:{
                int code = fruit.hashCode();
                yield code;
            }
        };
        System.out.println("opt = " + opt);
    }
}
