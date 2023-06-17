import java.util.Scanner;
public class Scanner_1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number:");
		float a = in.nextFloat();
		System.out.println("Enter second number");
		float b = in.nextFloat();
		System.out.println("Enter operator:");
		char op = in.next().charAt(0);
		float r = 0;

		switch (op){
			case'+':
				r = a + b;
				System.out.println(a + " + " + b + " =" + r);
				break;
			case'-':
				r = a - b;
				System.out.println(a + " - " + b + " = " + r);
				break;
			case'*':
				r = a * b;
				System.out.println(a + " * " + b + " = " + r);
				break;
			case '/':
				r = a / b;
				System.out.println(a + " / " + b + " = " + r);
				break;
			default:
				System.out.println("Invalid Operator");
		}
	}
}