package 배열;

public class string여러가지처리방법 {

	public static void main(String[] args) {
		String s = "I am programmer.";
		String s2 = "나는";
		
		System.out.println(s + s2);
		System.out.println(s.concat(s2));
		System.out.println(s2.concat(s));
		System.out.println(s.charAt(0));
		System.out.println(s.endsWith("잉"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 8));
		System.out.println(s.contains(s2));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.replace("I am", "You"));

	}

}
