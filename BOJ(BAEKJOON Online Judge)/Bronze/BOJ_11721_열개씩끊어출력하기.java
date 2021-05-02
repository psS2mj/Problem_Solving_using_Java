import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @date: 2021/05/02
 * @author: psS2mj
 * @brief: BOJ_11721_열 개씩 끊어 출력하기 */

public class BOJ_11721_열개씩끊어출력하기 {

	static String word;
	static int len;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		word = br.readLine();
		len = word.length() / 10;

		for (int i = 0; i < len; i++) {
			System.out.println(word.substring(i * 10, i * 10 + 10));
		}
		System.out.println(word.substring(len * 10));

	} // main

}