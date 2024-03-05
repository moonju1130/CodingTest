package codingTest;

// 나머지가 1이 되는 수 찾기
public class Test7_0129 {
	public static void main(String[] args) {
		int answer = 0;
		int n = 10;
		
		for(int i = 1; i < n; ++i) {
			if(n % i == 1) {
				answer = i;
				break;
			}
		}
		
		System.out.println("정답 : " + answer);

	}
}
