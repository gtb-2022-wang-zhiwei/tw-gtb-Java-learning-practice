public class Sum {
	public static void main(String[] args) {
		int sum = 0;
        int m = 20;
		int n = 100;
		do {
            sum = sum+m;
            m++;
		} while (m<=n);
		System.out.println(sum);
	}
}