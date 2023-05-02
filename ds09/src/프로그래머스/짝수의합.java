package 프로그래머스;

public class 짝수의합 {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		for (int i = 2; i <= n; i+=2) {
			answer += i;
		}
		System.out.println(answer);
	}

}
