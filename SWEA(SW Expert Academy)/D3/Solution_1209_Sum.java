import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2020/05/09
 * @author: psS2mj
 * @brief: SWEA_1209_Sum (D3) */

public class Solution_1209_Sum {
	static int T, sum, max;
	static int[] sums;
	static int[][] nums;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; tc++) {
			max = Integer.MIN_VALUE;
			nums = new int[100][100];
			sums = new int[202];
			T = Integer.parseInt(br.readLine());
			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; j++) {
					nums[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			// 1. 각 행의 합 구하기
			for (int i = 0; i < 100; i++) {
				sum = 0;
				for (int j = 0; j < 100; j++) {
					sum += nums[i][j];
				}
				sums[i] = sum;
			}
			// 2. 각 열의 합 구하기
			for (int i = 0; i < 100; i++) {
				sum = 0;
				for (int j = 0; j < 100; j++) {
					sum += nums[j][i];
				}
				sums[i+100] = sum;
			}
			// 3. 대각선의 합 구하기
			// 왼 위 -> 오 아래
			sum = 0;
			for (int i = 0; i < 100; i++) {
				sum += nums[i][i];
			}
			sums[200] = sum;
			// 오 위 -> 왼 아래
			sum = 0;
			for (int i = 0; i < 100; i++) {
				sum += nums[i][99-i];
			}
			sums[201] = sum;
			
			// 최댓값 찾기
			for(int n : sums) {
				max = (max < n) ? n : max ;
			}
			System.out.println("#" + tc + " " + max);
		}
	} // main
} // class
