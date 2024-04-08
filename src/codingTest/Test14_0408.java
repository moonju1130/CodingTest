package codingTest;

// 음양 더하기
public class Test14_0408 {
	public static void main(String[] args) {
		int[] a = {4,7,12};
		boolean[] b = {true, false, true};
		
		System.out.println("정답 : " + solution(a, b));
	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i = 0; i < absolutes.length; i++) {
			if(signs[i]) {
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}
		}
		
		return answer;
	}
}
