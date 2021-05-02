import java.io.*;
import java.util.*;

/* @date: 2021/05/02
 * @author: psS2mj
 * @brief: BOJ_11399_ATM */

public class BOJ_11399_ATM {

	static int N, time = 0;
	static int[] waiting_times;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		waiting_times = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			waiting_times[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(waiting_times);

		for (int i = 0; i < N; i++) {
			time += waiting_times[i] * (N - i);
		}
		System.out.println(time);

	} // main

}