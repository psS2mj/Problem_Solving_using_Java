import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/* @date: 2020/05/21
 * @author: psS2mj
 * @brief: BOJ_1205_등수 구하기 */

public class Main_1205_등수구하기 {
	static int N, score, P;
	static LinkedList<Integer> rank = new LinkedList<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		score = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		if (N == 0) { // 랭킹 리스트에 아무것도 없을 때는 송유진이 1등
			System.out.println(1);
			return; // 끝내기.
		}
		// N>0인 경우
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			rank.add(tmp); // 현재 랭킹 리스트에 있는 점수 저장
		}
		int size = rank.size();
		if (size == P && (score <= rank.get(size-1))) { // 랭킹에 올라갈 수 없을 때
			System.out.println(-1);
		} else { // 랭킹에 올라갈 수 있을 때
			for (int i = 0; i < size; i++) {
				if(score >= rank.get(i)) {
					System.out.println(i+1);
					return;
				}
				if (i == size-1) {
					System.out.println(size+1);
				}
			}
		}
	} // main
} // class
