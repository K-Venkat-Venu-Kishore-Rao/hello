package loops;
import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do{
			n = sc.nextInt();
		} while(n != 0);
			System.out.println(n);
	}
}
