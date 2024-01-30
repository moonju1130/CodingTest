package codingTest;

// 자릿수 더하기
public class Test6_0129 {
	public static void main(String[] args) {
        int answer = 0;
        
        int n = 123;
        
        while(n > 0){
            answer += n%10;
            n/=10;
        }

        System.out.println(answer);
	}
}
