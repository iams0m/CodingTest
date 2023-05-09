package 프로그래머스;

public class 최빈값구하기 {

	public static void main(String[] args) {
		int[] array = {1, 1, 2, 2};
		int answer = array[0]; // 임의의 정답 설정
		int max = 0; // 임의의 최빈값 설정
		int[] frequent = new int[1000];
		for (int i = 0; i < array.length; i++) {
			frequent[array[i]]++;
			
			if (frequent[array[i]] > max) {
				max = frequent[array[i]];
				answer = array[i];
			}
		}
		
		int temp = 0;
		for (int j = 0; j < 1000; j++) {
			if (max == frequent[j]) {
				temp++;
			}
		}
		
		if (temp > 1) {
			answer = -1;
		}
		System.out.println(answer);
	}

}
