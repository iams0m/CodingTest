package 배열;
import java.util.*;

public class 점의위치구하기 {

	public static void main(String[] args) {
		int[] dot = {3, 2};
		Solution4 sol = new Solution4();
		int answer = sol.solution(dot);
		System.out.println(answer);

	}

}

class Solution4 {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] > 0){
            answer = 1;
        }else if(dot[0] < 0 && dot[1] > 0){
            answer = 2;
        }else if(dot[0] < 0 && dot[1] < 0){
            answer = 3;
        }else{
            answer = 4;
        }
        return answer;
    }
}
