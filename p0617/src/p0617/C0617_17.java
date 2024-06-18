package p0617;

import java.util.Scanner;

public class C0617_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 랜덤 숫자 10개 생성(1-100), 숫자 합 출력
		int sum = 0;
		for (int i=1;i<=10;i++) {
			int ran  = (int) (Math.random()*100)+1;
			sum += ran;
			System.out.println(i+"번째\nrandom: "+ran+"\n합: "+sum+"\n");
		}

	}

}
