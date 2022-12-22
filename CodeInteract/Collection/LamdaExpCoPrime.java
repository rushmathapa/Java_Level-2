package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LamdaExpCoPrime {

	public static boolean isPrime(int num) {

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static boolean iscomposit(int num1) {

		for (int i = 3; i <= num1; i += 2) {
			if (num1 % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(numbers.stream().filter(m -> isPrime(m)).collect(Collectors.toList()));
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Map<Boolean, List<Integer>> values = numbers.stream().collect(Collectors.partitioningBy(c -> isPrime(c)));
		System.out.println(values);
	}

}