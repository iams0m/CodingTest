package 프로그래머스;

public class 숫자찾기 {

	public static void main(String[] args) {
		int num = 29183;
		int k = 1;

		int answer = 0;
		String s = String.valueOf(num);
		String s2 = String.valueOf(k);

		if (s.indexOf(s2) == -1) {
			answer = -1;
		} else {
			answer = s.indexOf(s2) + 1;
		}
		
		System.out.println(answer);
	}
}
