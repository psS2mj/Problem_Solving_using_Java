import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D3_8888_시험 {

	static int TC, N, T, P;
//	static int TC, N, T, P, index, cnt, grade;
//	static int[][] test;
//	static int[] score;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken()); // 참가자의 수
			T = Integer.parseInt(st.nextToken()); // 문제 개수
			P = Integer.parseInt(st.nextToken()); // 지학이의 번호 P (배열에서는 -1)
			int[][] test = new int[N][T + 3]; // 총점과 푼문제의 수와 등수를 저장할 공간 고려
			int[] score = new int[T];
			// 배열 채우기
			for (int i = 0; i < N; i++) {
				int cnt = 0;
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				for (int j = 0; j < T; j++) {
					test[i][j] = Integer.parseInt(st2.nextToken());
					if (test[i][j] == 1) { // 푼 문제의 개수 계산
						cnt++;
					}
				}
				test[i][T + 1] = cnt; // 푼 문제의 개수 저장
			}
			// 점수 계산 시작
			int index = 0;
			for (int i = 0; i < T; i++) {
				int cnt = 0;
				for (int j = 0; j < N; j++) {
					if (test[j][i] == 0) { // 해당 문제를 풀지 못한 참가자가 있을 때마다
						cnt++; // 해당 문제에 배정되는 점수 1씩 증가
					}
				}
				score[index++] = cnt; // 문제에 배정되는 점수를 저장하는 배열
			}
			// 참가자 총점 계산
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < T; j++) {
					test[i][T] += test[i][j] * score[j];
				}
			}
			
//			// 출력
//			for (int i = 0; i < test.length; i++) {
//				for (int j = 0; j < test.length; j++) {
//					System.out.print(test[i][j] + " ");
//				}
//				System.out.println();
//			}
//			
//			System.out.println("---- 아래는 score");
//			for(int i: score){
//				System.out.print(i + " ");
//			}
//			System.out.println();
			
			// 등수 계산 시작
			for (int i = 0; i < N; i++) {
				int grade = 0;
				for (int j = 0; j < N; j++) {
					if (i == j)
						continue;
					if (test[i][T] < test[j][T]) { // 1. 자신보다 많은 점수를 획득한 참가자의 수
						grade++;
					}
					if (test[i][T] == test[j][T] & test[i][T + 1] < test[j][T + 1]) { // 2. 자신과 같은 점수를 획득하였지만 더 많은 문제를 푼 참가자의 수
						grade++;
					}
					if (test[i][T] == test[j][T] & test[i][T + 1] == test[j][T + 1] & i > j) { // 3. 자신과 같은 점수를 획득하고 같은 수의 문제를 풀었지만 번호가 더 작은 참가자의 수
						grade++;
					}
				}
				test[i][T + 2] = grade + 1;
			}
			
//			// 랭킹 출력
//			System.out.println("---- 아래는 랭킹 포함");
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < T+3; j++) {
//					System.out.print(test[i][j] + " ");
//				}
//				System.out.println();
//			}
			
			
			System.out.println("#" + tc + " " + test[P - 1][T] + " " + test[P - 1][T + 2]);
		}

	}

}
