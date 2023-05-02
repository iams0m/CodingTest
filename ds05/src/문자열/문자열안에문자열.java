package 문자열;

public class 문자열안에문자열 {

	public static void main(String[] args) {
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		
		int answer = 2;
		if (str1.contains(str2)) {
			answer = 1;
		}
		
		System.out.println(answer);
		
//		System.out.println(str1.indexOf("a"));
//		System.out.println(str1.lastIndexOf("4"));
		
//		//없는 것의 인덱스를 찾으면, -1 리턴
//		System.out.println(str1.indexOf("p"));

	}

}
