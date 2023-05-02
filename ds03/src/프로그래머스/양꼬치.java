package 프로그래머스;

public class 양꼬치 {

	public static void main(String[] args) {
		int n = 9;
		int k = 6;
		Solution2 sol = new Solution2();
		int answer = sol.solution(n, k);
		System.out.println(answer);

	}

}

class Solution2 {
    public int solution(int n, int k) {
        int answer = 0;
        answer = (n * 12000) + (k * 2000) - (n / 10) * 2000; 
        return answer;
    }
}