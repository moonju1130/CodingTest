package codingTest;

// 문자열 내 p와 y의 개수
public class Test7_0129 {
	public static void main(String[] args) {
		String s = "pPoooyY";
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < s.length(); ++i) {
			if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				a += 1;
				System.out.println("a : " + a);
			} else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				b += 1;
				System.out.println("b : " + b);
			}
		}
		
		System.out.println("a는 : " + a);
		System.out.println("b는 : " + b);
	}
}
