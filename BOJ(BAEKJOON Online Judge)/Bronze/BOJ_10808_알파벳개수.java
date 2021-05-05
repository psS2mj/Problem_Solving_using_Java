import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @date: 2021/05/05
 * @author: psS2mj
 * @brief: BOJ_10808_알파벳 개수 */

public class BOJ_10808_알파벳개수 {

	static String S;
	static int[] alphabet = new int[26];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		S = br.readLine();

		for (int i = 0; i < S.length(); i++) {
			alphabet[S.charAt(i) - 97]++;
		}

		for (int j = 0; j < 26; j++) {
			System.out.print(alphabet[j] + " ");
		}

	} // main

}
