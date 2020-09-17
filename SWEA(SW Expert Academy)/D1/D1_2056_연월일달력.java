package com.swea.d1;

import java.util.Scanner;

public class D1_2056_연월일달력 {

	/*
	public static void main(String[] args) {
		// 연월일 달력
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		int check;
		for (int test_case = 1; test_case <= T; test_case++) {
			check = 0;
			char[] ymd = sc.next().toCharArray(); // 인덱스 0~3:연도, 4~5: 월, 6~7: 일
			// 월 (1~12) 유효성 검사
			int month = (ymd[4] - 48) * 10 + (ymd[5] - 48);
			if (month < 1 || month > 12) {
				check++;
//				break;
			} else { // 월 유효성 검사 통과 시 일 (각 달에 맞게) 유효성 검사
				int day = (ymd[6] - 48) * 10 + (ymd[7] - 48);
				switch (month) {
				case 1:
					if (day < 1 || day > 31)
						check++;
					break;
				case 2:
					if (day < 1 || day > 28)
						check++;
					break;
				case 3:
					if (day < 1 || day > 31)
						check++;
					break;
				case 4:
					if (day < 1 || day > 30)
						check++;
					break;
				case 5:
					if (day < 1 || day > 31)
						check++;
					break;
				case 6:
					if (day < 1 || day > 30)
						check++;
					break;
				case 7:
					if (day < 1 || day > 31)
						check++;
					break;
				case 8:
					if (day < 1 || day > 31)
						check++;
					break;
				case 9:
					if (day < 1 || day > 30)
						check++;
					break;
				case 10:
					if (day < 1 || day > 31)
						check++;
					break;
				case 11:
					if (day < 1 || day > 30)
						check++;
					break;
				case 12:
					if (day < 1 || day > 31)
						check++;
					break;
				}
			} // else
			System.out.print("#" + test_case + " ");
			if (check > 0) // 유효성 검사 결과: 날짜가 유효하지 않을 경우
				System.out.println("-1");
			else {
				for (int i = 0; i < ymd.length; i++) {
					System.out.print(ymd[i]);
					if (i == 3 || i == 5)
						System.out.print("/");
				}
				System.out.println("");
			}
		}
	}*/

	public static void main(String[] args) {
		int daysOfMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31}; 
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    for(int tc=1; tc<=T; tc++) {
	        String s = sc.next();
	        int month = Integer.valueOf(s.substring(4,6));
	        int day = Integer.valueOf(s.substring(6,8));
	        String res = "-1";
	        if( 1<=month && month<=12 && 1<=day && day<=daysOfMonth[month-1] ) {
	            res = String.format("%s/%s/%s", s.substring(0,4), s.substring(4,6), s.substring(6,8));
	        }
	        System.out.format("#%d %s\n", tc, res);
	    }
	}
}
