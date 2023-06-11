package 프로그래머스;

import java.util.*;

public class 한번만등장한문자 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // 문자열 입력 받기
        String answer = "";
        String[] str = s.split("");
        int count = 0;

        Arrays.sort(str);

        for (int i = 0; i < str.length; i++) {
            count = 0;

            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) { // 현재 문자와 동일한 문자를 찾으면
                    count++; // 등장 횟수 증가
                }
            }
            if (count == 1) {
                answer += str[i]; // 결과에 해당 문자를 추가
            }
        }

        System.out.println(answer);
    }
}
