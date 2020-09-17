import java.util.Scanner;

/* @date: 2020/04/07
 * @author: psS2mj
 * @brief: BOJ_2747_피보나치 수 */

public class Main_2747_피보나치수 {

	static int num;
	static long[] memo;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		memo = new long[num+1];
		System.out.println(fibo1(num));
	}
	
	private static long fibo1(int n) {
		if(n<=1) {return n;}
		if(memo[n]!=0) {return memo[n];}
		else {
			return memo[n] = fibo1(n-1) + fibo1(n-2);
		}
	}

}
