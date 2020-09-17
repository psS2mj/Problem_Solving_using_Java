import java.util.Scanner;

/* @date: 2020/04/17
 * @author: psS2mj
 * @brief: BOJ_2193_이친수 */

public class Main_2193_이친수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] d = new long[N+3];
		d[1] = 1;
		d[2] = 1;
		d[3] = 2;
		for (int i = 4; i <= N; i++) {
			d[i] = d[i-2] * 2 + d[i-3];
		}
		System.out.println(d[N]);
	} // main
} // class
