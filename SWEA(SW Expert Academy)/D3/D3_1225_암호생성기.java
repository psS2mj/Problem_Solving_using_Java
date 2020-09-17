import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* queue를 사용해야겠다. */
public class D3_1225_암호생성기 {

	static int T = 10, n, tmp, check; // 테스트 케이스의 개수
	static boolean stop;

	public static void main(String[] args) throws IOException {
		Queue<Integer> amho = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= T; tc++) {
			amho.clear();
			stop = false;
			n = Integer.parseInt(br.readLine()); // 왜 필요한건지 잘 모르겠음
			// 8자리 암호 생성
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 8; i++) {
				amho.add(Integer.parseInt(st.nextToken()));
			}

			while (stop == false) {
				for (int i = 1; i <= 5; i++) {
					tmp = amho.poll();
					check = tmp - i;
					if (check <= 0) {
						stop = true;
						break;
					} else {
						amho.add(check);
					}
				}
			}

			// queue 출력
			Iterator<Integer> iter = amho.iterator();
			System.out.print("#" + tc + " ");
			for (; iter.hasNext();) {
				int num = iter.next();
				System.out.print(num + " ");
			}
			System.out.println("0");
		}
	}

}
