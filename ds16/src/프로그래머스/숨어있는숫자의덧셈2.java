package 프로그래머스;

public class 숨어있는숫자의덧셈2 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		int sum = 0;
        String[] parts = my_string.split("[^0-9]+"); // 정규표현식
        // 숫자가 아닌 모든 문자열을 구분자로 사용
        //System.out.println(Arrays.toString(parts));
        
        for (String part : parts) {
            if (!part.isEmpty()) {
                sum += Integer.parseInt(part);
            }
        }

        System.out.println(sum);

	}

}
