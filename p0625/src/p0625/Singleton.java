package p0625;

public class Singleton {
	
	private int hour; //인스턴스 변수:객체 선언 필요
	
	//static - 클래스 분수: 객체선언X, 클래스명.변수명
	private static Singleton s = new Singleton();
	
	private Singleton (){} //기본생성자
	
	//클래스 메소드: 객체 선언없이, 클래스명.메소드명
	public static Singleton getInstance() {
		return s;
	}
}
