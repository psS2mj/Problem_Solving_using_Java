/* @date: 2020/03/27
 * @author: psS2mj
 * @brief: SWEA_3431_준환이의 운동관리 (D3) */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_3431_준환이의운동관리 {

	static int T, L, U, X, result;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			L = Integer.parseInt(st.nextToken()); // L분 이상
			U = Integer.parseInt(st.nextToken()); // U분 이하의 운동을 해야함
			X = Integer.parseInt(st.nextToken()); // 이번주 운동시간

			if (X > U) result = -1;
			else {
				if (X < L) result = L - X;
				else result = 0;
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}