package 컬렉션2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째작은수_중복X_정렬O {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while (true) {
			int data = sc.nextInt();
			if (data == 0) {
				break;
			}else {
				list.add(data);
			}
		}
		System.out.println(list);
		Object[] result = list.toArray();
		System.out.println(k + "번째 작은 수 : " + result[k - 1]);
	}

}
