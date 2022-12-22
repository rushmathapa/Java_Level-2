package codeinteracts.level2.oop.encapsulation;

import java.util.Scanner;
import java.lang.Integer;

public class ReverseMaxInteger {
	int num;
	
	public int reverse(int num){
		int rev = 0;
		while (num!=0) {
			rev = rev * 10 + num %10;
			num = num / 10;
		}
		return rev;
		
	}

	public static void main(String[] args) {
		ReverseMaxInteger revrse = new ReverseMaxInteger();
		System.out.println("Enter user given number");
		Scanner Scan = new Scanner(System.in);
		int data = Integer.MAX_VALUE;
		if(data > Integer.MAX_VALUE) {
			System.out.println("Enter Integer value in range");
		}
		System.out.println(revrse.reverse(data));
		
	}

}
