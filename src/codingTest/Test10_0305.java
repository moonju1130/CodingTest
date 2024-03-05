package codingTest;

// 정수 제곱근 판별
public class Test10_0305 {
	public static void main(String[] args) {
		long answer = 0;
		double a = Math.sqrt(121);
		System.out.println(a);
		
		answer = (a % 1 == 0 ? (long)Math.pow(a+1, 2) : -1);
		
		System.out.println("정답 : " + answer);
	}
	
}
