package 컬렉션2;

import java.util.HashMap;

public class HashMap확인문제 {

	public static void main(String[] args) {
		String[] fruit = { "apple", "banana", "apple", "banana", "melon", "apple" };
		HashMap<String, Integer> map = new HashMap<>();
		for (String key : fruit) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}

		System.out.println(map);

		int max = 0;
		String maxKey = "";
		for (String key : map.keySet()) {
			//System.out.println(key + " : " + map.get(key));
			if (map.get(key) > max) {
				max = map.get(key);
				System.out.println(key + "의 특표수는 " + max);
				maxKey = key;
			}
		}
		System.out.println("최다 득표자는 " + maxKey + "(" + max + ")");
		
		System.out.println(map.keySet());
	}

}
