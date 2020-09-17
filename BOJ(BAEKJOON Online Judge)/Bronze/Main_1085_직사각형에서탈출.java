import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* @date: 2020/05/22
 * @author: psS2mj
 * @brief: BOJ_1085_직사각형에서 탈출 */

public class Main_1085_직사각형에서탈출 {
	static int x, y, w, h;
	static int[] dis = new int[4];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		dis[0] = h - y;
		dis[1] = y;
		dis[2] = x;
		dis[3] = w - x;
		Arrays.sort(dis);
		System.out.println(dis[0]);
	} // main
} // class
