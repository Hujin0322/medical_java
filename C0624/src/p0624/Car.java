package p0624;

public class Car {
	//클래스 내 변수 = 인스턴스 변수
	static int count = 0; 
	String serial_no;
	String color;
	String gearType;
	int door;
	
	//초기화 블럭: 생성자 호출 전 먼저 실행.(공통 실행 부분)
	{
		count+=1;
		this.serial_no = "HD"+String.format("%04d",count);
	}
	
	//생성자: 클래스 이름과 동일, 
	 	//매개변수(오버로딩: 이름 동일, 매개변수 갯수 or 타입 틀림)
	Car(){ }
//		this("white", "auto",4); //this(): 생성자 내에서 다른 생성자 호출
//	} //기본 생성자				 // this 위에 다른 생성자 올 수 없음.
	
//	Car(String c){} // 타입 다른 생성자
//	
//	//이름 다르면 메소드 취급 void 필요
//	void Car2(){}	
	
	Car(String color){
		this.color = color;
		}
	
	Car (String color, String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		//this => 참조변수
		}
}