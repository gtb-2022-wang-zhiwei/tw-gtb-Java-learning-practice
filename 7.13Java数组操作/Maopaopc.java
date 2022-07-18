import java.util.Arrays;

public class Maopaopc {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        System.out.println(Arrays.toString(ns));
        for (int i=ns.length-1;i>0;i--){
           for (int j=ns.length-1;j>ns.length-i-1;j--){
              if (ns[j] > ns[j-1]) {
              int tmp = ns[j];
              ns[j]=ns[j-1];
              ns[j-1] = tmp;
              }
           }
        }
        System.out.println(Arrays.toString(ns));
    }
}