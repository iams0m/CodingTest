package 프로그래머스;

import java.util.Scanner;

public class k의개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		Solution sol = new Solution();
		int answer = sol.solution(i, j, k);
		System.out.println(answer);
		sc.close();

	}
}

class Solution {
	public int solution(int i, int j, int k) {
        int answer = 0;
        for (int l = i; l <= j; l++) {
			String str = Integer.toString(l); // l을 문자열로 변환한 후, str 변수에 저장 => 각 자리 숫자를 확인하기 위해 사용
			for (int m = 0; m < str.length(); m++) {
				// 현재 확인 중인 자리 숫자가 k와 같은지 확인
				if (Integer.toString(k).equals(str.substring(m, m + 1))) {
					// Integer.toString(k) : k를 문자열로 변환
					// str.substring(m, m + 1) : str에서 m번째 인덱스부터 m+1번째 인덱스까지 자른 부분 문자열 => 현재 확인 중인 자리 숫자
					answer++; // k가 현재 확인 중인 정수에 등장한 횟수 저장
				}
			}
		}
        return answer;
    }
}