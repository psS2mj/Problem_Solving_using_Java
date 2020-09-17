import java.util.Scanner;

/* @date: 2020/04/23
 * @author: psS2mj
 * @brief: 프로그래머스_연습문제_두 정수 사이의 합 */

public class Solution_두정수사이의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(solution(a, b));
	}
	// 구현하는 부분
	public static long solution(int a, int b) {
		long answer = 0;
		long diff = (int) Math.abs(a - b);
		if (a == b) {
			answer = a;
		} else if (a < b) {
			for (int i = 0; i <= diff; i++) {
				answer += a++;
			}
		} else {
			for (int i = 0; i <= diff; i++) {
				answer += b++;
			}
		}
		return answer;
	} // main
} // class