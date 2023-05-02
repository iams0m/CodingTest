package 문자열;

import java.util.*;

public class String에서Char배열로옮기기3 {
	
	public static void print(String[] s) {
		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args) {
		String s = "2056521"; 
		//1. 마지막 위치의 숫자가 1이면 서대문구에서 출생, 1이 아니면 다른 구에서 출생 프린트
		char last = s.charAt(s.length() - 1);
		if (last == '1') {
			System.out.println("서대문구 출생");
		}else {
			System.out.println("다른 구 출생");
		}
		System.out.println("------------------------------");
		
		//2. "52"를 추출하여 두 숫자를 더해보세요.
		//더해서 10이 넘지 않으면 유효한 주민번호
		//유효한 주민번호인지 아닌지 출력
		char[] result = new char[2];
		s.getChars(4, 6, result, 0);
		System.out.println(Arrays.toString(result));
		int i1 = Character.getNumericValue(result[0]);
		int i2 = Character.getNumericValue(result[1]);
		
		if (i1 + i2 < 10) {
			System.out.println(i1 + i2 + " >> 유효한 주민번호");
		}else {
			System.out.println(i1 + i2 + " >> 유효하지 않은 주민번호");
		}
		System.out.println("------------------------------");
		
		//3. 주민번호에 포함된 5의 갯수 출력, 하나씩 끊어와서 구하기
		char[] result2 = new char[s.length()];
		int count = 0;
		s.getChars(0, s.length(), result2, 0);
		System.out.println(Arrays.toString(result2));
		for (int i = 0; i < result2.length; i++) {
			if (result2[i] == '5') {
				count++;
			}
		}
		System.out.println("5의 갯수 : " + count);
		System.out.println("------------------------------");

		String[] stringArray = s.split("");
		int count2 = 0;
		for (String s2 : stringArray) {
			if (s2.equals("5")) { //s2.contains("5")
				count2++;
			}
		}
		System.out.println(count2);
		System.out.println("------------------------------");
		
		int count3 = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '5') {
				count3++;
			}
		}
		System.out.println(count3);
		System.out.println("------------------------------");
		
		//인덱스를 빨리 찾는 방법(함수)
		System.out.println(Arrays.binarySearch(stringArray, "5"));
		
		//배열에 특정한 값을 한꺼번에 변경할 수 있는 함수(코딩테스트에서 사용)
		Arrays.fill(stringArray, 0, 3, "hoho");
		//System.out.println(Arrays.toString(stringArray));
		System.out.println("------------------------------");
		
		//배열의 순서를 다 뒤집어라.
		Arrays.sort(stringArray); // 정렬(오름차순)
		
		//Arrays로 내림차순 가능하지만 너무 복잡해 => 컬렉션으로 전환하면 더 간단
		//System.out.println(Arrays.toString(stringArray));
		print(stringArray);
		System.out.println("------------------------------");
		
		List<String> list = Arrays.asList(stringArray);
		Collections.sort(list); // 정렬(오름차순)
		Collections.reverse(list); // 정렬(내림차순)
		System.out.println(list);
		System.out.println("------------------------------");
		
		//배열 안의 데이터 빈도수(횟수) 구하는 방법
		int count4 = Collections.frequency(list, "hoho");
		System.out.println(count4);
		
	}

}
