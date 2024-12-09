package java_coding_test;

public class Solution5 {
	public static void main(String[] args) {
		// ★특수문자(!@#$%^&*(\'"<>?:;) 출력
		System.out.println("!" + "@" + "#" + "$" + "%" + "^" + "&" + "*" + "("
				+ "\\" + "\'" + "\"" + "<" + ">" + "?" + ":" + ";");
	}
}


// 핵심은 \, ', "를 어떻게 출력하는지였음..
// 역슬래시(\)를 이용하여 출력함 --> 