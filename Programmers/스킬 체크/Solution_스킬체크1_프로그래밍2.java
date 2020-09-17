/* @date: 2020/04/11
 * @author: psS2mj
 * @brief: Programmers_스킬체크레벨1_프로그래밍2 */

public class Solution_스킬체크1_프로그래밍2 {
	class Solution {
		public String solution(String phone_number) {
			String answer = "";
			StringBuilder sb = new StringBuilder(answer);
			int len = phone_number.length();
			for (int i = 0; i < len - 4; i++) {
				sb.append("*");
			}
			for (int i = len - 4; i < len; i++) {
				sb.append(phone_number.charAt(i));
			}
			answer = sb.toString();
			return answer;
		}
	}
}
