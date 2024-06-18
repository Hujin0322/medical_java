package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로또 번호 생성, 섞기, 6개의 숫자 출력
		// 1. 1-45 배열 생성
		int [] ball = new int [45];
		int[] myArr = new int [6];
		int [] myLotto = new int [6];
		
		//2. 배열에 1-45 숫자 입력
		for (int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		//3. 랜덤 숫자 생성
		int no = 0; // 가상 주소
		int t_value = 0;
		
		for (int i=0;i<300;i++) {
			no = (int) ((Math.random()*45));
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		}
		
		// 4. 숫자 입력
		int num = 0;
		int n = 0;
		while (n<6) {
			System.out.printf("%d번째 숫자를 입력하세요 (1-45) >> ",n+1);
			num = scan.nextInt();
			if (num<1 || num>45) {
				System.out.println("1-45 사이의 숫자만 입력 가능합니다. 다시 입력하세요.");
				continue;
			}
			myArr[n] = num;
			n++;
			} 
		
		System.out.println(Arrays.toString(myArr));
			
		// 5. 로또 번호 출력
				System.out.print("로또 번호: ");
				for (int i=0;i<6;i++) {
					System.out.print(ball[i]+" ");
				}System.out.println();
		
		// 로또 번호와 일치하는 번호 출력
		int count = 0;
		
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				if (myArr[i]==ball[j]) {
					myLotto[count] = myArr[i];
					count++;
					break;
				}
			}
		}
		System.out.println("로또 당첨 개수: "+count);
		System.out.print("당첨된 번호: ");
		for (int i=0;i<count;i++) {
			System.out.print(myLotto[i]+" ");
		}
		if (count==0) System.out.println("없음");
		
		// 당첨 금액: 6개-100억, 5개-1억, 4개=100만, 3개=1만  
		System.out.println();
		System.out.print("당첨 금액: ");
		switch(count) {
		case 3: 
			System.out.print("일만원");
			break;
		case 4: 
			System.out.print("일백만원");
			break;
		case 5: 
			System.out.print("일억원");
			break;
		case 6: 
			System.out.print("일백억원");
			break;
		default:
			System.out.print("다시 도전하세요.");
			break;
		}
		
		
		
		
	}

}
