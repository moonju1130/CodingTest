package codingTest;

// 약수의 합
public class Test3_0128 {
	public static void main(String[] args) {
		int n = 12;
		int answer = 0;
		
		for(int i = 1; i < n; ++i) {
			if(n % i == 1) {
				System.out.println(i);
				break;
			}
		}
	}
}