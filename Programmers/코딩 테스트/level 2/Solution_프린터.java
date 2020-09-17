import java.util.LinkedList;

/* @date: 2020/05/19
 * @author: psS2mj
 * @brief: 프로그래머스_코딩테스트연습_프린터 */

public class Solution_프린터 {
	public static void main(String[] args) {
//		int[] priorities = {2,1,3,2};
		int[] priorities = {1,1,9,1,1,1};
		int location = 0;
		System.out.println(solution(priorities,location));
	} // main

	static LinkedList<int[]> list = new LinkedList<int[]>();
	static int cnt;
	private static int solution(int[] priorities, int location) {
		int answer = 0;
		for (int i = 0; i < priorities.length; i++) {
			list.add(new int[] {priorities[i],i});
		}
		while(true) {
			int[] curr = list.poll();
			int value = curr[0];
			int loc = curr[1];
			int len = list.size();
			cnt = 0;
			for (int i = 0; i < len; i++) {
				// 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
				int[] tmp = list.get(i);
				// 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
				if(tmp[0]>value) {
					list.add(new int[] {value, loc});
					cnt++;
					break;
				}
			}
			// 그렇지 않으면 J를 인쇄합니다.
			if(cnt==0) {
				answer++;
				if(loc==location) {break;}
			}
		}
		return answer;
	}
} // class