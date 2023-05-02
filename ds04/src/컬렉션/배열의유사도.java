package 컬렉션;

import java.util.Arrays;
import java.util.List;

public class 배열의유사도 {

	public static void main(String[] args) {
		String[] s1 = { "a", "b", "c" };
		String[] s2 = { "com", "b", "d", "p", "c" };
		Solution0 sol = new Solution0();
		int answer = sol.solution(s1, s2);
		System.out.println(answer);

	}

}

class Solution0 {
	public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> list2 = Arrays.asList(s2);
        for (String x : s1) {
			if (list2.contains(x)) {
				answer++;
			}
		}
        return answer;
    }

//	public int solution(String[] s1, String[] s2) {
//		int answer = 0;
//		for (int i = 0; i < s1.length; i++) {
//			for (int j = 0; j < s2.length; j++) {
//				if (s1[i].equals(s2[j])) {
//					answer++;
//				}
//			}
//		}
//		return answer;
//	}
}
