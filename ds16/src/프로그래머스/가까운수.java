package 프로그래머스;

import java.util.Scanner;

public class 가까운수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = {10, 11, 12};
		Solution4 sol = new Solution4();
		int answer = sol.solution(array, n);
		System.out.println(answer);
		sc.close();

	}
}

class Solution4 {
    public int solution(int[] array, int n) {
        int min_val = array[0];
        int min = Math.abs(min_val - n);
        for(int i = 1; i < array.length; i++){
        	int diff = Math.abs(array[i] - n);
            if(diff < min || (diff == min && array[i] < min_val)){
            	min_val = array[i];
            	min = diff;
            }
        }
        return min_val;
    }
}