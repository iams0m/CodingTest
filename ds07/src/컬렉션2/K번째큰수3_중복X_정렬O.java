package 컬렉션2;

import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수3_중복X_정렬O {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(); // 입력할 개수
		int k = sc.nextInt(); // k번째 큰수
		TreeSet<Integer> set = new TreeSet<>(); // 오름차순
		//TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder()); // 내림차순
		for (int i = 0; i < size; i++) {
			set.add(sc.nextInt());
		}
		System.out.println(set);
		// set은 배열로 바꿔주는 것이 제일 편함
		Object[] result = set.toArray(); // 배열로 바꿔줌
		System.out.println(k + "번째 큰 수 : " + result[result.length - k]);
	}

}
