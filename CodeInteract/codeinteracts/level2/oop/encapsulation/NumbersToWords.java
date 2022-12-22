package codeinteracts.level2.oop.encapsulation;

import java.util.Scanner;

public class NumbersToWords {
	int num;

	void convert_to_words(char[] num) {
		int len = num.length;
		String[] one_digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
											"nine" };
		String[] two_digits = new String[] { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
											"seventeen", "eighteen", "ninteen" };
		String[] tense = new String[] { "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
										"ninety" };
		String[] tense_power = new String[] { "hundred", "thousand" };
		
	System.out.println(String.valueOf(num) + ":");
	
	if(len==1) {
		System.out.println(one_digits[num[0]-'0']);
		
	}
	int x = 0;
	while(x < num.length) {
		
	}
	
	
	}
	
	
	
	

	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		convert_to_words(str.charAt(num));

	}

}
