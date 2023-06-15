package 기본자료구조;

public class 소수나열하기 {

	public static void main(String[] args) {
		int counter = 0; // 나눗셈 횟수
		
		for (int n = 2; n <= 1000; n++) { // 2 ~ 1000까지 1씩 증가시키면서 그 값이 소수인지 판단
			int i;
			for (i = 2; i < n; i++) {
				counter++;
				if (n % i == 0) { // 나누어떨어지면 소수가 아님
					break; // 소수가 아니므로 더 이상 반복 불필요
				}
			}
			if (n == i) { // 마지막까지 나누어떨어지지 않으면
				System.out.println(n);
			}
		}

		System.out.println("나눗셈을 수행한 횟수: " + counter);
		
	}

}
