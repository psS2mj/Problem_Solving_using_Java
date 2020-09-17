import java.util.Scanner;

/* @date: 2020/05/23
 * @author: psS2mj
 * @brief: BOJ_14681_사분면 고르기 */

public class Main_14681_사분면고르기 {
	static int x, y, Ans = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		if (x*y > 0) { // 1사분면 or 3사분면
			Ans = (x<0) ? 3 : 1;
		} else { // 2사분면 or 4사분면
			Ans = (x<0) ? 2 : 4;
		}
		System.out.println(Ans);
	} // main
} // class
