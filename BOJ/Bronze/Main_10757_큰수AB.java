import java.math.BigInteger;
import java.util.Scanner;

/* @date: 2020/04/07
 * @author: psS2mj
 * @brief: BOJ_10757_큰 수 A+B */

public class Main_10757_큰수AB {

	static BigInteger A, B;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A = sc.nextBigInteger();
		B = sc.nextBigInteger();
		System.out.println(A.add(B));
	}

}
