public class Shuzupc {
    public static void main(String[] args) {
        int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        int count = 0;
         double sum = 0;
         for(int[]arr:scores){
            for(int n:arr){
                sum += n ;
                count ++ ;
            }
         }
         double average = (sum/count);
         System.out.println(average);
    }
}         