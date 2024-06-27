package p0624;

import java.util.Scanner;

public class Stu_pro {
	Scanner scan = new Scanner (System.in);
	int s_count = 0;
	
	String [] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	String stuNo, name;
	int kor, eng, math, total, rank;
	double avg;
	
	//화면 메소드
	int screen() {
		//화면 부분
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("---------------------");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 학생검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("---------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		scan.nextLine(); //enter키 때문
		return choice; 
	}//screen
}