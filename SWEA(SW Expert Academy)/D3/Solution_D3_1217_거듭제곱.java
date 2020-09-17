import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2020/03/28
 * @author: psS2mj
 * @brief: SWEA_1217_거듭 제곱 (D3) */

public class Solution_D3_1217_거듭제곱 {

	static int T, num, powNum, result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 0; tc < 10; tc++) {
			T = Integer.parseInt(br.readLine()); // 테스트 케이스의 번호
			StringTokenizer st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			powNum = Integer.parseInt(st.nextToken());

			result = pow(num, powNum);
			System.out.println("#" + T + " " + result);
		}
	}

	private static int pow(int n, int m) {
		// 기저조건
		if (m == 1) {
			return n;
		}
		return n * pow(n, m - 1);
	}
}