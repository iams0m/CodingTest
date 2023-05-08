package 프로그래머스;

public class 중복된문자제거 {

	public static void main(String[] args) {
		String my_string = "We are the world";
		String answer = "";
		//indexOf : 앞 인덱스를 우선으로 return하기 때문에 뒤 인덱스가 앞 인덱스랑 중복값이 존재한다면 인덱스 불일치로 무시
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.indexOf(my_string.charAt(i)) == i) {
				answer += my_string.charAt(i);
			}
		}

		System.out.println(answer);
	}

}
