import java.util.Scanner;

/* @date: 2020/04/07
 * @author: psS2mj
 * @brief: BOJ_10870_피보나치 수 5 */

public class Main_10870_피보나치수5 {

	static int num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println(fibo5(num));
	}
	
	private static int fibo5(int n) {
		if(n<=1) {return n;}
		else {
			return fibo5(n-1) + fibo5(n-2);
		}
	}

}
