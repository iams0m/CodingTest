package 프로그래머스;

public class 모스부호1 {

	public static void main(String[] args) {
		String letter = ".--. -.-- - .... --- -.";
		String answer = "";
		String[] morseList = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		String[] morse;
		morse = letter.split(" ");
		for (String s : morse) {
			for (int i = 0; i < morseList.length; i++) {
				if (s.equals(morseList[i])) {
					answer += Character.toString((char) (i + 'a'));
				}
			}
		}

		System.out.println(answer);

	}
}
