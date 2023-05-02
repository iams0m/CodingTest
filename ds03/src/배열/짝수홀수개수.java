package 배열;

import java.util.Arrays;

public class 짝수홀수개수 {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		Solution6 sol = new Solution6();
		int[] answer = sol.solution(num_list);
		System.out.println(Arrays.toString(answer));

	}

}

class Solution6 {
		public int[] solution(int[] num_list) {
	        int[] answer = {0, 0};
	        for (int i = 0; i < num_list.length; i++) {
				if(num_list[i] % 2 == 0) {
					answer[0]++;
				}else {
					answer[1]++;
				}
			}
	        return answer;
	    }
}
