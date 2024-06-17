package p0617;

import java.util.Scanner;

public class C0617_14_학생성적폼 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 성적 처리 프로그램 ]");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 성적 삭제");
		System.out.println("5. 학생 검색");
		System.err.println("--------------------");
		System.err.println("원하는 번호를 입력하세요. >> ");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1: System.out.println("1. 성적 입력을 시작합니다.");
			break;
		case 2: System.out.println("2. 성적 출력을 시작합니다.");
			break;
		case 3: System.out.println("3. 성적 수정을 시작합니다.");
			break;		
		case 4: System.out.println("4. 성적 삭제를 시작합니다.");
			break;
		case 5: System.out.println("5. 학생 검색을 시작합니다.");
			break;
		}

	}

}
