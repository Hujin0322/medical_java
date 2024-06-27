package p0626;

import java.util.ArrayList;

public class Buyer {
	String userId = "aaa";
	String userPw = "1111";
	int money;
	int bonusPoint;
//	Product[] cart = new Product[10]; //인스턴스 변수
	ArrayList list = new ArrayList(); //객체 배열 선언
//	int count; //인스턴스 변수
	
	Buyer(){}
	
	Buyer(String userId, String userPw, int money, int bonusPoint){
		this.userId = userId;
		this.userPw = userPw;
		this.money = money;
		this.bonusPoint = bonusPoint;
		
	}
	
	//구매 메소드 - 부모의 참조변수
	void buy(Product p) {
		if (money < p.price) {
			System.out.printf("잔액 부족 (잔액: %d 만원)\n",money);
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p); //객체 배열 추가 = add
//		cart[count++] = p; //구매 물품 저장 
		System.out.printf("%s 제품을 구매했습니다.(잔액: %d 만원)\n",p.pName,money);
		
	}
	
	void Summary() {
		System.out.println("[ 구매 내역 ]");
		int sum = 0;
		for (int i=0;i<list.size();i++) {
			Product p = (Product)list.get(i); //object type
			
			System.out.printf("%d. %s, %s \n",i+1,p.pName,p.price);
			sum += p.price;
		}System.out.printf("총 구매 금액: %d\n",sum);
	System.out.printf("총 구매 개수: %d",list.size());
	}
	
//	void buy(Refrigerator r) {
//		money -= r.price;
//		bonusPoint += r.bonusPoint;
//	}
		
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
	

//	// 캡슐화
//	public void getUserId(String userId) {
//		this.userId = userId;
//	}
//	
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
}
