import java.util.Scanner;

/* @date: 2020/05/23
 * @author: psS2mj
 * @brief: BOJ_1110_더하기 사이클 */

public class Main_1110_더하기사이클 {
	static int N, num1, num2, result, new_num, cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		new_num = N;
		while (true) {
			if (new_num < 10) {
				num1 = 0;
				num2 = new_num;
			} else {
				num1 = new_num / 10;
				num2 = new_num % 10;
			}
			result = num1 + num2;
			cnt++;
			// 새로운 수로 업데이트 해주기
			new_num = (num2 % 10) * 10 + (result % 10);
			// 원래의 수로 돌아왔는지 체크
			if (new_num == N) {
				break; // 끝내기.
			}
		}
		System.out.println(cnt);
	} // main
} // class
