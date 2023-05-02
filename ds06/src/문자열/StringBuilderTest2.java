package 문자열;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("pongpong");
		System.out.println(sb1);
		
		StringBuilder sb11 = new StringBuilder("pongpong");
		System.out.println(sb11);
		
		StringBuilder sb2 = new StringBuilder("pongpong");
		System.out.println(sb2);
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
		sb1.append(" haha");
		System.out.println(sb1);
		sb1.replace(0, 8, "hoho"); // 파괴형 함수
		System.out.println(sb1);
		sb1.delete(0, 8);
		System.out.println(sb1);
		sb1.deleteCharAt(0);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);

	}

}
