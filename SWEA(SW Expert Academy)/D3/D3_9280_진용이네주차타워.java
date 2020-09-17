import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* queue를 이용하라고 하심 */
public class D3_9280_진용이네주차타워 {

	static int T, n, m, cnt, totalSum;
	static int[] parkingLot, R_i, W_i;

	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> watingCar = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
		for (int tc = 1; tc <= T; tc++) {
			totalSum = 0;
			watingCar.clear();
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken()); // 주차장 개수
			m = Integer.parseInt(st.nextToken()); // 차량의 무게
			// 배열 생성
			parkingLot = new int[n];
			R_i = new int[n];
			W_i = new int[m];
			for (int i = 0; i < n; i++) {
				R_i[i] = Integer.parseInt(br.readLine());
			}
			for (int i = 0; i < m; i++) {
				W_i[i] = Integer.parseInt(br.readLine());
			}

			// 주차장 영업 시작
			for (int i = 0; i < 2 * m; i++) {
				cnt = 0;
				int tmp = Integer.parseInt(br.readLine());
				// tmp가 양수일 때 (주차할 때)
				if (tmp > 0) {
					for (int j = 0; j < n; j++) {
						if (parkingLot[j] == 0) { // 비어있는 주차공간이 있다면
							parkingLot[j] = tmp; // 주차시킨다.
							cnt++;
							break;
						}
					}
					if (cnt == 0) {
						watingCar.add(tmp); // 대기 큐에서 기다린다.
					}
				} else { // tmp가 음수일 때 (차 뺄 때)
					tmp = Math.abs(tmp);
					for (int j = 0; j < n; j++) {
						if (parkingLot[j] == tmp) {
							parkingLot[j] = 0;
							totalSum += R_i[j] * W_i[tmp - 1]; // 요금 정산
							if (!watingCar.isEmpty()) { // 만약 대기하고 있는 차가 있다면
								parkingLot[j] = watingCar.poll();
							}
						}
					}
				}
			}

			System.out.println("#" + tc + " " + totalSum);
		}
	}
}
