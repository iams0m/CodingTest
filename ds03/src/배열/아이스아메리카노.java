package 배열;

import java.util.Arrays;

public class 아이스아메리카노 {

	public static void main(String[] args) {
		int money = 5500;
		Solution5 sol = new Solution5();
		int[] answer = sol.solution(money);
		System.out.println(Arrays.toString(answer));

	}

}

class Solution5 {
	public int[] solution(int money) {
		int[] answer = {0, 0};
		//int[] answer = new int[2];
		answer[0] = money / 5500;
		answer[1] = money % 5500;
		return answer;
	}
}
