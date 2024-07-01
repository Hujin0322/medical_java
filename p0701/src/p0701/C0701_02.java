package p0701;

import java.util.ArrayList;

public class C0701_02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Card(1,"CLOVER"));
		list.add(new Card(10,"HEART"));
		list.add(new Card(2,"SPADE"));
		
		//list 출력
		for (int i=0;i<list.size();i++) {
			Card c = (Card) list.get(i); //형변환 필요
//			System.out.println(list.get(i)); --> @Override 필요
			System.out.println(c.getKind()+","+c.getNumber());
		}
	}

}
