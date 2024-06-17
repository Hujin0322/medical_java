package p0614;

public class C0614_04 {
	
	static int num; // 클래스 내 변수 - 자동 초기화 됨.
	
	// 메소드 내에서는 무조건 변수값 초기화 필수.
	public static void main(String[] args) {
		//초기화: 숫자 = 0, boolean = false, 문자 = null
//		int score; // 자동 초기화X --> 무조건 초기화 필수
//		System.out.println(score); // score 초기화X --> 에러
		System.out.println(num); // 클래스 변수 초기화 필요X

	}

}
