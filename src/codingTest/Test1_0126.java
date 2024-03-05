package codingTest;

import java.util.Arrays;

// 평균값 구하기
public class Test1_0126 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		
		double sum = 0;
		
		for(int num : arr) {
			sum += num;
		}
		
		double answer = sum / arr.length;
		
		System.out.println("정답 1 : " + answer);
		
		double answer2 = Solution2(arr);
		System.out.println("정답 2 : " + answer2);
	}
	
	public static double Solution2(int[] arr) {
		return Arrays.stream(arr).average().getAsDouble();
	}
}
