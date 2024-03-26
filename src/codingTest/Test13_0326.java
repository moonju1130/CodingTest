package codingTest;

public class Test13_0326 {
	public static void main(String[] args) {
		int num1 = 3, num2 = 5;
		System.out.println("정답 : " + solution(num1, num2));
		
		System.out.println("정답2 : " + sumAtoB(Math.min(num1, num2), Math.max(num1, num2)));
		// Math.min과 Math.max를 이용하여 작은 값에서 큰 값으로의 범위를 지정해준다.
	}
	
	public static long solution(int a, int b) {	// 내가 풀었던 방식
		long answer = 0;
		
		if(a > b) {
			for(int i = b; i <= a; i++) {
				answer += i;
				System.out.println(answer);
			}
		} else {
			for(int i = a; i <= b; i++) {
				answer += i;
				System.out.println(answer);
			}
		}
		return answer;
	}
	
	public static long sumAtoB(long a, long b) { // 등차수열의 합 공식을 이용한 풀이
		return (b - a + 1) * (a + b) / 2;
	}
}
