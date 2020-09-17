import java.util.Scanner;

/* @date: 2020/04/07
 * @author: psS2mj
 * @brief: BOJ_2748_피보나치 수 2 */

public class Main_2748_피보나치수2 {

	static int num;
	static long[] memo;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		memo = new long[num+1];
		System.out.println(fibo2(num));
	}
	
	private static long fibo2(int n) {
		if(n<=1) {return n;}
		if(memo[n]!=0) {return memo[n];}
		else {
			return memo[n] = fibo2(n-1) + fibo2(n-2);
		}
	}

}
