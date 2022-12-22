package codeinteracts.level2.oop.encapsulation;

public class StaticDemo {
	static int i = 0;

	public static void main(String[] args) {
		int b = 1;
		
		
		System.out.println(b);
		System.out.println(i);
		System.out.println(b+i);
		// cannot print global varibale if we dont set ststic type
	}

}

//lets try using without static fix 
