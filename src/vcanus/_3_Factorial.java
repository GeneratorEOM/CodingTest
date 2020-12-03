package vcanus;

public class _3_Factorial {

	public static int factorial(int num) {
		// num == 1 이면 1을 리턴
		if(num == 1) return 1;
		// 재귀함수 호출 
		return num * factorial(num - 1);
	}
	public static void main(String[] args) {
		int result = factorial(20);
		System.out.println(result);

	}
	

 
}

