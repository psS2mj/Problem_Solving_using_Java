import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2020/05/24
 * @author: psS2mj
 * @brief: BOJ_2675_문자열 반복 */

public class Main_2675_문자열반복 {
	static int T, R;
	static String S;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuffer sb = new StringBuffer();
			R = Integer.parseInt(st.nextToken());
			S = st.nextToken();
			for (int i = 0; i < S.length(); i++) {
				char tmp = S.charAt(i);
				for (int j = 0; j < R; j++) {
					sb.append(tmp);
				}
			}
			System.out.println(sb);
		}
	} // main
} // class
