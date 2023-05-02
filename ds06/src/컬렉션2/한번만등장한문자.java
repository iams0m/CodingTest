package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		String s = "abbbccd";
		//1. 일단 문자열을 하나씩 분리할 예정
		//1-1) toCharArray()
		//1-2) split("")
		//1-3) charAt(index)
		
		//2. 어떤 문자들이 들어있는지 목록을 만들자.
		//	 중복을 없애면 목록을 구할 수 있을 것 같다.
		//	 => HashSet 사용
		HashSet<String> set = new HashSet<>();
		// => HashSet<String> set = new HashSet<String>(); 동일
		String[] s2 = s.split("");
		System.out.println(Arrays.toString(s2));
		//=> 배열에 있는 거 한꺼번에 출력
		for (String x : s2) {
			set.add(x); //중복된 것은 들어가지 않음
		}
		System.out.println(set.size());
		System.out.println(set);
		//배열 안에 set에 들어있는 요소가 1인 것만 찾으면 된다.
		Object[] set2 = set.toArray();//[a, b, c, d]
		List<String> list = Arrays.asList(s2);
		//=> for문 사용하지 말고 Collections.frequency(list, "a") 쓰기 위해 사용
		String answer = "";
		for (Object x : set2) {
			if (Collections.frequency(list, x) == 1) {
				answer = answer + x;
			}
		}
		System.out.println(answer);
	}

}
