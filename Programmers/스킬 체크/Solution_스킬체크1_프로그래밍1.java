/* @date: 2020/04/11
 * @author: psS2mj
 * @brief: Programmers_스킬체크레벨1_프로그래밍1 */

public class Solution_스킬체크1_프로그래밍1 {
	class Solution {
		public String solution(int num) {
			String answer = "";
			answer = (num % 2 == 0) ? "Even" : "Odd";
			return answer;
		}
	}
}
