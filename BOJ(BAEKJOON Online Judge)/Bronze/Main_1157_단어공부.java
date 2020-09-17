import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @date: 2020/05/25
 * @author: psS2mj
 * @brief: BOJ_1157_단어 공부 */

public class Main_1157_단어공부 {
	static String word;
	static int max = -1, check = 0, idx;
	static int[] alpha = new int[26];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		word = br.readLine().toUpperCase(); // 입력받을 때 모두 대문자로 바꿔줌
		for (int i = 0; i < word.length(); i++) {
			alpha[word.charAt(i) - 'A']++;
		}
		// 최댓값 구하기
		for (int i = 0; i < 26; i++) {
			if (max < alpha[i]) {
				max = alpha[i];
				idx = i;
			}
		}
		// 최댓값이 여러 개인지 확인
		for (int i : alpha) {
			if (i == max) {
				check++;
				if (check == 2) {
					System.out.println("?");
					return;
				}
			}
		}
		System.out.println((char) (idx + 'A'));
	} // main
} // class
