package codingTest;

// x만큼 간격이 있는 n개의 숫자
public class Test5_0129 {
    public static void main(String[] args) {
        int x = -4;
        int n = 2;
        
        long[] answer = new long[n]; // 배열의 크기를 지정

        for (int i = 0; i < n; ++i) {
            answer[i] = (long)x * (i + 1); // 각 요소에 값을 저장
            System.out.println(answer[i]);
        }
    }
    
    
}

