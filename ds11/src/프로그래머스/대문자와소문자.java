package 프로그래머스;

public class 대문자와소문자 {

	public static void main(String[] args) {
		String my_string = "cccCCC";
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			char c = my_string.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c -= 32;
			}else if (c >= 'A' && c <= 'Z') {
				c += 32;
			}
			answer += c;
		}
		
		System.out.println(answer);
	}

}
