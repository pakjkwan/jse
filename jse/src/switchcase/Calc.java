package switchcase;

public class Calc {
	public static void main(String[] args) {
		System.out.println("숫자 입력");
		System.out.println("연산자 입력");
		String opcode = "";
		System.out.println("숫자 입력");
		switch (opcode) {
		case "+":break;
		case "-":break;
		case "*":break;
		case "/":break;
		case "%":break;

		default:System.out.println("연산기호를 정확하게 입력해 주세요"); break;
		}
		System.out.println(" 2 * 3 = 6");
		
	}
}
