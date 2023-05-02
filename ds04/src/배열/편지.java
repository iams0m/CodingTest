package 배열;

public class 편지 {

	public static void main(String[] args) {
		String message = "happy birthday!";
		Solution4 sol = new Solution4();
		int answer = sol.solution(message);
		System.out.println(answer);

	}

}

class Solution4 {
	public int solution(String message) {
        return message.length() * 2;
    }
}