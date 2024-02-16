package codingTest;

// 자연수 뒤집어 배열로 만들기
public class Test9_0215 {
	public static void main(String[] args) {
        long n = 12345;

        String str = Long.toString(n);
        
        int[] answer = new int[str.length()];
        
        for(int i = 0; i < str.length(); ++i) {
        	System.out.println(str.charAt(str.length()-1-i)-'0');
        	answer[i] = str.charAt(str.length()-1-i) - '0';
        	System.out.println(answer[i]);
        }
       
	}
}
