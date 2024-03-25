package codingTest;

public class Test12_0325 {
	public static void main(String[] args) {
		int num = 13;
		System.out.println("정답 : " + solution(num));
	}
	
	public static boolean solution(int x) {
		boolean answer = false;
		int sum = 0;
		
		String[] arr = String.valueOf(x).split("");
		
		for(int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
		if(x % sum == 0) {
			return answer = true;
		}
		
		return answer;
	}
}
