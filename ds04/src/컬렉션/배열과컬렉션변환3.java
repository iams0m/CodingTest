package 컬렉션;

import java.util.*;

public class 배열과컬렉션변환3 {

	public static void main(String[] args) {
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		stringPrint(s2);
		
		//배열로 하기에는 복잡한 처리 => list로 하면 편하다!
		//검색, 수정, 인덱스 작업 => asList() 사용
		//asList() : 실제 원본 배열로 처리하는 것이기 때문에 길이와 관련된 추가, 삭제, 삽입 작업이 불가능
		//추가, 삭제, 삽입 작업 => 모든 기능을 가진 ArrayList 사용
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(s2));
		//1. aaa가 포함되어있나요?
		System.out.println(list.contains("aaa"));
		//2. 맨 뒤에 "fff" 추가
		list.add("fff");
		System.out.println(list);
		//3. 원하는 index에 "ggg" 삽입
		list.add(1, "ggg");
		System.out.println(list);
		//4. "ccc" 삭제
		list.remove("ccc");
		System.out.println(list);
		System.out.println("-----------------------");
		//배열로 옮겨야 한다면 새롭게 배열 만들기
		String[] s3 = new String[list.size()];
		for (int i = 0; i < s3.length; i++) {
			s3[i] = list.get(i);
		}
		stringPrint(s3);
		
		
	}
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}

}
