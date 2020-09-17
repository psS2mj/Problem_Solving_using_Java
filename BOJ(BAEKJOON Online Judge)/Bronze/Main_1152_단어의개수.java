import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @date: 2020/05/25
 * @author: psS2mj
 * @brief: BOJ_1152_단어의 개수 */

public class Main_1152_단어의개수 {
	static String str;
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().trim();
		if(str.equals("")) { // 공백만 들어오는 경우 (trim으로 제거되기 때문에 "")
			System.out.println(0);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ') {cnt++;}
		}
		System.out.println(++cnt);
	} // main
} // class
