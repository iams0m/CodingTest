package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순으로배치하기 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";
		
		String[] s2 = s.split("");
		List<String> list = Arrays.asList(s2);
		Collections.sort(list);
		Collections.reverse(list);
		
		for (String x : list) {
			answer = answer + x; //answer += x;
		}
		
	}

}
