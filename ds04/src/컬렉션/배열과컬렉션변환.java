package 컬렉션;

import java.util.*;

public class 배열과컬렉션변환 {

	public static void main(String[] args) {
		int[] s = { 5, 2, 1, 9, 11, 15, 17 };
		//intPrint(s);
		Arrays.sort(s); // 파괴형 함수
		//intPrint(s);
		// System.out.println(Arrays.toString(s));

		String[] s2 = { "aaa", "bbb", "ccc", "aaa" };
		//stringPrint(s2);
		
		//1. 배열에 aaa가 있는지 궁금할 때
		//List로 변형하면, 조금 더 다양한 처리들을 for문을 사용하지 않고 할 수 있음
		List<String> list = new ArrayList<String>(Arrays.asList(s2));
		//System.out.println(list);
		//System.out.println(list.contains("aaa"));
		//1. bbb삭제
		list.remove(1);
		//2. ccc가 들어있는 위치
		System.out.println(list.indexOf("ccc"));
		//3. aaa가 들어있는 마지막 위치
		System.out.println(list.lastIndexOf("aaa"));
		//4. 전체 내용 프린트
		System.out.println(list);
		//5. 맨 앞에 ddd 삽입
		list.add(0, "ddd");
		//6. 맨 뒤에 fff 삽입
		list.add(s2.length, "fff");
		//7. 인덱스 2번의 내용을 ggg로 변경
		list.set(2, "ggg");
		//8. 전체 내용 프린트
		System.out.println(list);
	}

	//배열에 한계가 있어서 List로 변환하여 다양한 처리를 함.
	//코딩 테스트에서는 반환을 거의 배열로 하게 되어 있음.
	
	// 반복적으로 사용되는 것은 함수로 만들어라.
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}

}
