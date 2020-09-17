import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @date: 2020/05/28
 * @author: psS2mj
 * @brief: BOJ_11718_그대로 출력하기 */

public class Main_11718_그대로출력하기 {
	static String str;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
	} // main
} // class
