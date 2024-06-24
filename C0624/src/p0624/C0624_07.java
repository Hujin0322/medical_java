package p0624;

import java.util.Arrays;

public class C0624_07 {

	public static void main(String[] args) {
		int a = 10;
		int b= 5;
		int [] result = new int [4];
		
		// Element의 메소드 활용, a와 b의 사칙연산 결과값 출력
		Element e = new Element();
		e.allCal(a,b,result);

		System.out.println(Arrays.toString(result));
//		System.out.println(sub);
//		System.out.println(multi);
//		System.out.println(devide);

	}

}
