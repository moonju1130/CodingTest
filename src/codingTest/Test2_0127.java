package codingTest;

// 짝수와 홀수
public class Test2_0127 {
	public static void main(String[] args) {
        String answer = "";
        int num = 10;
        
        if(num % 2 == 0){
            answer = "Even";
        } else {
            answer = "Odd";
        }
        
        System.out.println(answer);
	}
}
