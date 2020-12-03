package vcanus;

public class _2_MethodChaining {

	public static void main(String[] args) {
		
		// Calculator 생정자로 num 초기화
		Calculator result = new Calculator(5);
		// 메서드 체이닝
		// 메서드에 리턴을 자기자신으로 리턴
		result.add(10).sub(5);
		System.out.println(result);
		
		Calculator result2 = new Calculator();
		result.setNum(10);
		result2.add(10).sub(5);
		System.out.println(result2);
	}
}
class Calculator {

	private int num;
	
	// num 이 없는 경우를 위해 빈 생성자를 만들어줘야함
	public Calculator() {
	}
	// 생성자로 num 을 받아서 초기화 하기 위함
	public Calculator(int num) {
		this.num = num;
	}
	// 메서드 체이닝 구현을 위해 return this(자기자신의 인스턴스를 가리킴);
	public Calculator add(int num) {
		this.num += num;
		return this;
	}
	// 메서드 체이닝 구현을 위해 return this(자기자신의 인스턴스를 가리킴);
	public Calculator sub(int num) {
		this.num -= num;
		return this;
	}
	// getNum
	public int getNum() {
		return num;
	}
	// setNum
	public void setNum(int num) {
		this.num = num;
	}
	// toString
	@Override
	public String toString() {
		return "num = " + num;
	}

}
