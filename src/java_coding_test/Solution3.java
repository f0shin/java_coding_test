package java_coding_test;

import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		// ★문자열과 숫자를 입력받아서 숫자 만큼 문자열 반복 출력
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println(str);
		}
		
		sc.close();
	}

}
