import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @date: 2020/04/03
 * @author: psS2mj
 * @brief: SWEA_4406_모음이 보이지 않는 사람 (D3) */

public class Solution_D3_4406_모음이보이지않는사람 {

	static int T;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String str = br.readLine();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < str.length(); i++) {
				char temp = str.charAt(i);
				if (temp != 'a' && temp != 'e' && temp != 'i' && temp != 'o' && temp != 'u') {
					sb.append(temp);
				}
			}

			System.out.println("#" + tc + " " + sb.toString());
		}
	}
}
