package p0626;

public class C0626_02 {

	public static void main(String[] args) {
		Buyer b = new Buyer("aaa","1111",1000,0);
		
		//구매내역
		Product[] cart = new Product[10];
		
		//Tv 구매
		Product t = new Tv();
		Product t2 = new Tv();
		b.buy(t); 		 //Tv 1대 구입
		b.buy(t2); //Tv 1대 구입
		b.buy(new Tv()); //Tv 1대 구입
		
		//다형성: 부모의 참조변수로 자손의 객체를 다루는 것
		//Computer 구매
		Product c = new Computer();
		b.buy(c);
		
		//Audio 구매
		Product a = new Audio();
		b.buy(a);
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Audio());
		
		Product r = new Refrigerator();
		b.buy(r);
		b.buy(new Refrigerator());
		
		//cart의 제품명, 가격 모두 출력하시오.
		b.Summary();
		//b.list
//		System.out.println("[ 구매 내역 ]");
//		int sum = 0;
//		for (int i=0;i<b.list.size();i++) {
//			Product p = (Product)b.list.get(i); //object type
//			
//			System.out.printf("%d. %s, %s \n",i+1,p.pName,p.price);
//			sum += p.price;
//		}System.out.printf("총 구매 금액: %d\n",sum);
//	System.out.printf("총 구매 개수: %d",b.list.size());
	}

}
