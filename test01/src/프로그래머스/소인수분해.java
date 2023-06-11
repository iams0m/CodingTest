package 프로그래머스;

import java.util.HashSet;
import java.util.Scanner;

public class 소인수분해 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	
	        // 입력 받기
	        System.out.print("자연수 n을 입력하세요: ");
	        int n = scanner.nextInt();
	
	        // 소인수분해 수행
	        HashSet<Integer> set = new HashSet<>();
	        for (int i = 2; i <= n; i++) {
	            while (n % i == 0) {
	                set.add(i);
	                n /= i; // n을 i로 나눈 결과를 n에 다시 대입, n을 i로 나누어 떨어지지 않을 때까지 나누는 과정
	            }
	        }
	        if (n != 1) set.add(n);
	
	        // 결과 출력
	        System.out.println("결과: ");
	        for (int num : set) {
	            System.out.print(num + " ");
	        }
	    }
	}

