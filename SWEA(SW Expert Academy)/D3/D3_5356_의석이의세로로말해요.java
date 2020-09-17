import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class D3_5356_의석이의세로로말해요 {

	static int T;
	static char[][] words;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			words = new char[5][15];
//			for (int i = 0; i < 5; i++) {
//				Arrays.fill(words[i], ' ');
//			}
			for (int i = 0; i < 5; i++) {
				char[] str = br.readLine().toCharArray();
				System.arraycopy(str, 0, words[i], 0, str.length);
			}
//			for (int i = 0; i < 5; i++) {
//				for (int j = 0; j < 15; j++) {
//					System.out.print(words[i][j] + " ");
//				}
//				System.out.println();
//			}
			StringBuilder sb = new StringBuilder(); // 얘가 더 빠르네 메모리도 적게쓰고
//			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 5; j++) {
					if(words[j][i]!='\0') {
						sb.append(words[j][i]);
					}
				}
			}
			System.out.println("#" + tc + " " + sb.toString());
		}
	}

}
