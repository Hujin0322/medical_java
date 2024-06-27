package p0625;

public class C0625_07 {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = null;
		Ambulance a = new Ambulance();
		Ambulance a2 = null;
		FireEngine f = new FireEngine();
		FireEngine f2 = null;
		
		// 다형성: 부모의 참조변수로 자손의 객체를 다루는 것
		// 자손의 참조변수로 조상의 객체를 다루는 것(X)
		// 자손참조변수 = 조상의 객체
//		a2 = (Ambulance) c;
		
		c = a; //부모의 참조변수에 자손객체를 넣어줌.
		if (c instanceof Car) {
			System.out.println("가능");
			c = a;
		}
		a2 = (Ambulance) c;
		
		
//		//형 변환 - 자손 타입에서 조상 타입: 형변환 타입 생략
// 		a.siren();
//		c2 = a; //Ambulance - Car
// 		c2.drive();
//// 		c2.siren();
// 		
// 		a2 = (Ambulance) c2;
//// 		a2.siren(); //부모의 참조변수로 사용 불가
// 		
// 		
//// 		c2 = (Car)a;
// 		a2 = (Ambulance) c2;//Car에서는 타입 확입
// 		a2.siren();
 		
	}

}
