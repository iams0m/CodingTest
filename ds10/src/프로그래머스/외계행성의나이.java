package 프로그래머스;

public class 외계행성의나이 {

	public static void main(String[] args) {
		int age = 23;
		String answer = "";
		String s = String.valueOf(age);
		String[] arr = s.split("");
		for (int i = 0; i < arr.length; i++) {
			answer += (char)((Integer.parseInt(arr[i]) + 97)); //아스키코드
		}
		System.out.println(answer);
	}

}
