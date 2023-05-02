package 문자열;

public class 문자반복출력하기 {

	public static void main(String[] args) {
		String my_string = "hello";
		int n = 3;
		Solution1 sol = new Solution1();
		String answer = sol.solution(my_string, n);
		System.out.println(answer);

	}

}

class Solution1 {
	public String solution(String my_string, int n) {
        String answer = "";
        char[] c = my_string.toCharArray();
        for (char x : c) { //{'h', 'e', 'l', 'l', 'o'}
        	for (int i = 0; i < n; i++) {
        		answer = answer + x;
			}
			
		}
        //String[] s = my_string.split("");
        //string보다 char가 메모리를 더 적게 사용
        //index가 필요할 때 for문 c타입 사용, 아니면 for-each
        return answer;
    }
}