package 프로그래머스;

public class 옷가게 {

	public static void main(String[] args) {
		int price = 580000;
		Solution3 sol = new Solution3();
		int answer = sol.solution(price);
		System.out.println(answer);

	}

}

class Solution3 {
    public int solution(int price) {
    	int answer = price;
        if (price >= 500000) {
			answer = (int)(price * 0.8);
		}else if (price >= 300000) {
			answer = (int)(price * 0.9);
		}else if (price >= 100000) {
			answer = (int)(price * 0.95);
		}
		return answer;
    }
}