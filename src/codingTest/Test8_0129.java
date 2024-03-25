package codingTest;

// 문자열 내 p와 y의 개수
public class Test8_0129 {
	public static void main(String[] args) {
        boolean answer = true;
        String s = "pPoooyY";
        int a = 0, b = 0;
        
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                a += 1;
            } else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                b += 1;
            }
        }
        
        if(a == b) {
            System.out.println("true반환 : " + answer);
        } else {
            System.out.println("false반환 : " + answer);
        }
	}
}
