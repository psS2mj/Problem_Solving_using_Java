import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @date: 2020/05/10
 * @author: psS2mj
 * @brief: SWEA_1213_String (D3) */

public class Solution_1213_String {
	static int T, Ans;
	static String search, str;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; tc++) {
			T = Integer.parseInt(br.readLine());
			search = br.readLine(); // 찾을 문자열
			str = br.readLine(); // 전체 문자열
			str = str.replaceAll(search, "*");
			Ans = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '*') {Ans++;}
			}
			System.out.println("#" + T + " " + Ans);
		}
	} // main
} // class
