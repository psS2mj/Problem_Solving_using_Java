import java.util.Arrays;

/* @date: 2020/04/23
 * @author: psS2mj
 * @brief: 프로그래머스_2019 KAKAO BLIND RECRUITMENT_실패율 */

public class Solution_실패율 {
	public static void main(String[] args) {
		int N = 4;
//		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		int[] stages = { 4, 4, 4, 4, 4 };
		int[] answer = new int[N];
		answer = solution(N, stages);
		System.out.println(Arrays.toString(answer));
	}

	// 구현 하는 부분
	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		double[] fail = new double[N];
		double same, cnt;
		for (int i = 1; i <= N; i++) {
			same = 0;
			cnt = 0;
			for (int s : stages) {
				if (s >= i) {
					cnt++;
				}
				if (s == i) {
					same++;
				}
			}
			if (cnt == 0) { // 스테이지에 도달한 유저가 없는 경우
				fail[i - 1] = 0;
			} else {
				fail[i - 1] = same / cnt;
			}
		}
		// 실패율 순위 구하기
		int i = 0, tmp;
		while (N > 0) {
			tmp = 0;
			double max = -1;
			for (int k = 0; k < fail.length; k++) {
				if (fail[k] >= 0 && fail[k] > max) {
					max = fail[k];
					tmp = k;
				}
			}
			fail[tmp] = -1;
			answer[i++] = tmp + 1;
			N--;
		}
		return answer;
	}
}
