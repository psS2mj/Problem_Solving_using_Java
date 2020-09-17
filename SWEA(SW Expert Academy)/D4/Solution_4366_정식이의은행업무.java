import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* @date: 2020/05/01
 * @author: psS2mj
 * @brief: SWEA_4366_정식이의 은행업무 (D4) */

public class Solution_4366_정식이의은행업무 {
	static int T;
	static long Ans;
	static String num2, num3;
	static List<Long> list = new ArrayList<Long>();
	static List<Long> list2 = new ArrayList<Long>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			// 테스트케이스마다 리스트 초기화
			list.clear();
			list2.clear();
			// 2진수 -> 10진수
			num2 = br.readLine(); // 입력받은 2진수의 값
			// 2진수를 자릿수 한 자리씩만 바꿔서 10진수로 변환하여 리스트에 저장
			for (int i = 0; i < num2.length(); i++) {
				StringBuilder sb = new StringBuilder(num2);
				if (num2.charAt(i) == '0') {
					sb.setCharAt(i, '1');
					list.add(Long.parseLong(sb + "", 2));
				} else {
					sb.setCharAt(i, '0');
					list.add(Long.parseLong(sb + "", 2));
					
				}
			}
			// 3진수 -> 10진수
			num3 = br.readLine(); // 입력받은 3진수의 값
			// 2진수를 자릿수 한 자리씩만 바꿔서 10진수로 변환하여 리스트에 저장
			for (int i = 0; i < num3.length(); i++) {
				StringBuilder sb2 = new StringBuilder(num3);
				if (num3.charAt(i) == '0') {
					sb2.setCharAt(i, '1');
					list2.add(Long.parseLong(sb2 + "", 3));
					sb2 = new StringBuilder(num3);
					sb2.setCharAt(i, '2');
					list2.add(Long.parseLong(sb2 + "", 3));
				} else if (num3.charAt(i) == '1') {
					sb2.setCharAt(i, '0');
					list2.add(Long.parseLong(sb2 + "", 3));
					sb2 = new StringBuilder(num3);
					sb2.setCharAt(i, '2');
					list2.add(Long.parseLong(sb2 + "", 3));
				} else {
					sb2.setCharAt(i, '0');
					list2.add(Long.parseLong(sb2 + "", 3));
					sb2 = new StringBuilder(num3);
					sb2.setCharAt(i, '1');
					list2.add(Long.parseLong(sb2 + "", 3));
				}
			}
			// 두 리스트 중 더 긴 것을 기준으로 하나씩 대조해보면서 같은 값이 존재하면 그 값을 답으로 하고 break
			if(list.size()>=list2.size()) {
				for (int i = 0; i < list.size(); i++) {
					if(list2.contains(list.get(i))==true) {
						Ans = list.get(i);
						break;
					}
				}
			} else {
				for (int i = 0; i < list2.size(); i++) {
					if(list.contains(list2.get(i))==true) {
						Ans = list2.get(i);
						break;
					}
				}
			}
			System.out.println("#" + tc + " " + Ans);
		}
	} // main
} // class
