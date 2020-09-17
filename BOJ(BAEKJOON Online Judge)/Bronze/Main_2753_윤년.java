import java.util.Scanner;

/* @date: 2020/04/03
 * @author: psS2mj
 * @brief: BOJ_2753_윤년 */

public class Main_2753_윤년 {

	static boolean result = false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4==0) { // 4의 배수이면서
			result = true;
			if(year%100==0) {result=false;} // 100의 배수가 아닐 때 윤년 (즉, 100의 배수면 윤년 X)
			if(year%400==0) {result=true;} // 400의 배수면 윤년
		}
		
		System.out.println(result==true?1:0);
	}
}