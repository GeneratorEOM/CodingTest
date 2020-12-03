package vcanus;

public class _4_StackOverflow {
	
	// 스택오버플로우를 해결하기 위해 꼬리 재귀를 사용한다고하는데 해결이 되질 않는다.
	// 그래서 차선책으로 반복문을 이용하였다.
	public static int factorial(int num) {
		// 결과값을 담을 변수
		int result = 1;
		// num = 1 까지 반복
		while(num > 0) {
			result = result * num;
			num -= 1;
		}
		return result;
	}
	public static void main(String[] args) {
		int result = factorial(5);	
		System.out.println(result);

	}
	

}
