package codingTest;

// 서울에서 김서방 찾기
public class Test15_0411 {
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		System.out.println("정답 : " + solution(seoul));
	}
	
	public static String solution(String[] seoul) {
		String answer = "";
		
		for(int i = 0; i < seoul.length; i++) {
			System.out.println(seoul[i]);
			if(seoul[i].equals("Kim")) {
				System.out.println("김서방은 " + i + "에 있다.");
			}
		}
		return answer;
	}
}
