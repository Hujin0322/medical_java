package p0620;

public class C0620_06 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(11+6);
		System.out.println(11-6);
		System.out.println(11*6);
		System.out.println(11/6);
		
		
		int num = 0;
		int num2 = 10;
		
		num2 = num;
//		num2 = ;
		
		
		//객체 선언
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t2 ch: "+t2.channel);
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t2 ch: "+t2.channel);
		
		// Class는 객체 선언
//		Tv t = new Tv();
//		// 형태: 참조변수명.변수명 = 값
//		t.channel = 7;
//		t.channelUp();
//		System.out.println("현재 채널: "+t.channel);
//		t.channelDown();
//		t.channelDown();
//		System.out.println("현재 채널: "+t.channel);
	}

}
