package p0625;

public class C0625_01 {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();//기본생성자 호출
		System.out.println("반지름: "+c1.r);
		System.out.printf("원점: (%d,%d) \n ",c1.center.x,c1.center.y);
		
//		Point p = new Point(150,150);
		
//		Circle c2 = new Circle(p,50);
		Circle c2 = new Circle(new Point (150,150),50);
		
		System.out.println("반지름: "+c2.r);
		System.out.printf("원점: (%d,%d) \n ",c2.center.x,c2.center.y);
		c2.draw(); // Circle에 Shape가 상속된 상태 - 객체 선언 필요X 
				   // sysout되어 있음.
		
		int [] a = {1,2,3};
		
		Point p1 = new Point(100,100);
		Point p2 = new Point(140,50);
		Point p3 = new Point(200,100);
		
		//객체 형태 전달 방법 1. 참조변수로
		Point [] p = {p1,p2,p3}; 
		Triangle t1 = new Triangle(p);
		
		//객체 형태 전달 방법 2
		Point [] pp = {new Point(100,100), new Point(140,50), new Point(200,100)};
		Triangle t2 = new Triangle(pp); //맞는 생성자 찾아감.
		
		//객체 형태 전달 방법 3
		Triangle t3 = new Triangle(new Point(0,0),new Point(100,100),new Point(50,50));
		
		
		
//		Point3D p = new Point3D(); //객체 선언 -> 포함 관계
//		p.x = 100;
//		System.out.println(p.x);
//		
//		Point p2 = new Point(); //객체 선언 -> 포함 관계

	}

}
