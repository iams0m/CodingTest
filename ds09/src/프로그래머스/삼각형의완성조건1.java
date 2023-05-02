package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;

public class 삼각형의완성조건1 {

	public static void main(String[] args) {
		int[] sides = {1, 2, 3};
		ArrayList<Integer> list = new ArrayList<>();
		for (int x : sides) {
			list.add(x);
		}
		Collections.sort(list);
		int max = list.get(2);
		int other1 = list.get(0);
		int other2 = list.get(1);
		int answer = 1;
		if (max >= (other1 + other2)) {
			answer = 2;
		}
		
		System.out.println(answer);

	}

}
