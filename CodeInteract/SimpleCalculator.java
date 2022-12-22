
public class SimpleCalculator {
	SimpleCalculator() {

	}

	int num1;
	int num2;

	public SimpleCalculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public static void main(String[] args) {
		SimpleCalculator calc1 = new SimpleCalculator();
		calc1.num1 = 20;
		calc1.num2 = 10;
		System.out.println(calc1.num1 + calc1.num2);
		System.out.println(calc1.num1 - calc1.num2);
		System.out.println(calc1.num1 / calc1.num2);
		System.out.println(calc1.num1 * calc1.num2);
	}

}
