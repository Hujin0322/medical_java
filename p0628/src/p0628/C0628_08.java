package p0628;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C0628_08 {

	public static void main(String[] args) {
		
		Process p = new Process();
		//list, list2의 값 모두 출력
		HashMap<String, Object> map = p.read_con();
		Object obj = map.get("list");
		ArrayList list = (ArrayList) obj;
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		obj = map.get("list2");
		ArrayList list2 = (ArrayList) obj;
		for (int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		
		//set 출력
		Object obj3 = map.get("set");
		HashSet set = (HashSet) obj3;
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
//		HashMap map = new HashMap();
//		map.put("aaa", 1111);
//		map.put("bbb", 1234);
//		map.put("aaa", 1111);
//		map.put("aaa", 1111);
//		
//		String str = "bbb";
//		
//				
//		if(map.containsKey(str)) {
//			System.out.println("동일한 정보가 있습니다.");
//		}else {
//			System.out.println("동일한 정보가 없습니다.");
//		}
//		System.out.println();
//		
//		Iterator it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		HashSet set = new HashSet ();
//		
////		set.add("abc");
////		set.add("abc");
//		set.add(new Person("홍길동",1));
//		set.add(new Person("유관순",2));
//		set.add(new Person("이순신",3));
//		set.add(new Person("강감찬",4));
//		set.add(new Person("김구",5));
//		
//		System.out.println(set);
//		
//		//Iterator(): 1회용, 2번 출력 위해선 다시 선언 필요 
//		Iterator it =  set.iterator();
//		while(it.hasNext()) { // 현재 객체가 있는지 확인
//			Person p = (Person) it.next(); //객체 1개 가져오기
//			System.out.println(p.name);
//		}
//		
//		it =  set.iterator();
//		while(it.hasNext()) { // 현재 객체가 있는지 확인
//			Person p = (Person) it.next(); //객체 1개 가져오기
//			System.out.println(p.name);
//		}
//		
//		ArrayList list = new ArrayList();
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		Iterator it2 = list.iterator();
//		while(it2.hasNext()) { // 현재 객체가 있는지 확인
//			Person p = (Person) it2.next(); //객체 1개 가져오기
//			System.out.println(p.name);
//		}
		
//		HashSet set = new HashSet();
//		set.add(new Card(1,"SPADE"));
//		set.add(new Card(2,"DIAMOND"));
//		set.add(new Card(3,"HEART"));
//		set.add(new Card(4,"CLOVER"));
//		set.add(new Card(1,"SPADE"));
//		set.add(new Card(6,"SPADE"));
		
//		System.out.println(set);
		
//		HashSet set = new HashSet(); //중복 제거
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("3");
//		set.add("1");
//		set.add("1");
//		set.add("4");
//		
//		System.out.println(set);
		
//		//int
//		Object [] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
//		Set set = new HashSet();
//		
//		for (int i=0;i<objArr.length;i++) {
//			set.add(objArr[i]);
//		}
//		
//		System.out.println(set);
	}

}//class


class Person{
	String name;
	int age;
	
	Person(){}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+":"+age;
		
	}
	
}
