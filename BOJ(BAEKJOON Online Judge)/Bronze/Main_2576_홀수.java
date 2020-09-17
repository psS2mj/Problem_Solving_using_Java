import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

/* @date: 2020/05/24
 * @author: psS2mj
 * @brief: BOJ_2576_홀수 */

public class Main_2576_홀수 {
	static int num, sum = 0;
	static LinkedList<Integer> odd = new LinkedList<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 7; i++) {
			num = Integer.parseInt(br.readLine());
			if (num % 2 == 1) { // 입력된 숫자가 홀수일 때
				sum += num;
				odd.add(num);
			}
		}
		if (odd.isEmpty()) { // 홀수가 존재하지 않는 경우
			System.out.println(-1);
		} else {
			System.out.println(sum);
			Collections.sort(odd); // 오름차순 정렬
			System.out.println(odd.get(0));
		}
	} // main
} // class
