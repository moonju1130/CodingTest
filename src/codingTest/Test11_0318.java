package codingTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

// 정수 내림차순으로 배치하기
public class Test11_0318 {
	public static void main(String[] args) {
		long a = 12345;
		System.out.println("정답 : " + solution(a));
	}
	
	public static long solution(long n) {
		String[] arr = Long.toString(n).split("");
		Arrays.sort(arr, Comparator.reverseOrder());
		String result = Arrays.stream(arr).collect(Collectors.joining());
		return Long.valueOf(result);
	}
}	
