package p0614;

public class C0614_06 {

	public static void main(String[] args) {
		float f = 1.6f;
		int i = (int) f; //float 타입 --> int 타입 (float > int)
		System.out.println(i);
		
		int n = 10;
		float fl = n;
		System.out.println(n); //10
		System.out.println(fl); //10.0
		
		// 큰 --> 작은 (타입 붙여줌)
		// byte -> short,char -> int -> long -> float -> double
		int n2 = 65;
		char ch = (char) n2; // 형변환
		System.out.println(ch);
		
		char ch2 = 'a';
		int n3 = ch2;
		System.out.println(n3); //97
		
		int n4 = 10;
		float f2 = n4;
		System.out.println(f2); //10.0

	}

}
