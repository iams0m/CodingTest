package 문자열;

import java.util.Arrays;

public class 스트링을배열로 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		//1. String[]으로 바꿔보세요.
		String[] all2 = all.split(", ");
	
		//2. 바꾸었더니 공백이 포함되어 있다면, 공백을 모두 제거 한 후, 다시 배열에 넣어주세요.
//		String[] all2 = all.split(",");
//		for (int i = 0; i < all2.length; i++) {
//			if(all2[i].contains(" ")) {
//			all2[i] = all2[i].trim();
//			}
//		}
		System.out.println(Arrays.toString(all2));
		
		//3. 과목수는?
		System.out.println("과목수는 " + all2.length + "과목");
		
		//4. 컴퓨터의 인덱스는?
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].equals("컴퓨터")) {
				System.out.println("컴퓨터의 위치(인덱스)는 " + i);
			}
		//5. 과목명이 3글자 미만인 과목수는?	
			if (all2[i].length() < 3) {
				count++;
			}
		}
		System.out.println("3글자 미만의 과목수는 " + count + "개");
		
		String s = "홍길동";
		System.out.println(s.length());
		System.out.println(s.equals("김길동"));
		System.out.println(s.substring(1));
		System.out.println(s.indexOf("동"));
	}

}
