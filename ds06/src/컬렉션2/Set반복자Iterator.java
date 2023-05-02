package 컬렉션2;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자Iterator {

	public static void main(String[] args) {
		HashSet<String> bag = new HashSet<>();
		bag.add("휴대폰");
		bag.add("지갑");
		bag.add("지갑");
		bag.add("패드");
		System.out.println(bag.size());
		System.out.println(bag);
		
		//Sol)1
		//set에서 꺼내올 때는 iterator를 만들어주어야 한다.
		Iterator<String> it = bag.iterator();
		System.out.println(it.hasNext()); //있는지 없는지 체크
		//set : index 사용X
		for (int i = 0; i < bag.size(); i++) { //3
			String x = it.next();
			System.out.println(x);
		}
		
		//Sol)2
		Object[] bag2 = bag.toArray();
		//HashSet은 Object로만 가능
		for (Object x : bag2) {
			System.out.println(x);
		}
	}

}
