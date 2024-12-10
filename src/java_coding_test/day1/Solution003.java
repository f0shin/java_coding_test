package java_coding_test.day1;

import java.util.Scanner;

public class Solution003 {
	public static void main(String[] args) {
		// 문자열과 숫자를 입력 받아서 문자열을 숫자 만큼 반복하여 출력하기
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println(str);
		}
		
		sc.close();
	}

}
