import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_1289_원재의메모리복구하기 {

	static int T, check, cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			check = 1;
			cnt = 0;
			char[] memory = br.readLine().toCharArray();
			// 0000에서 memory(원래 상태)로 갈 때 몇 번이나 고쳐야 하는가
			for (int i : memory) {
				if (i-48 == check) {
					cnt++;
					check = (check == 1) ? 0 : 1;
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}
	}

}
