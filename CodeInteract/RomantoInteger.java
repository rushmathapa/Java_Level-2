
public class RomantoInteger {

	public int digit(char x) {
		int value = 0;
		switch (x) {
		case 'I':
			value = 1;
			break;
		case 'v':
			value = 5;
			break;
		case 'X':
			value = 10;
			break;
		case 'L':
			value = 50;
			break;
		case 'C':
			value = 100;
			break;
		case 'D':
			value = 500;
			break;
		case 'M':
			value = 1000;
			break;
		default:
			value = 0;
		}
		return value;

	}

	public void convert(String roma) {
		int ans = 0;
		for (int i = 0; i < roma.length(); i++) {
			int n1 = digit(roma.charAt(i));
			if (i + 1 < roma.length()) {
				int n2 = digit(roma.charAt(i + 1));
				if (n1 < n2) {
					ans += n2 - n1;
					i++;
				} else {
					ans += n1;
				}

			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		System.out.println();
		RomantoInteger r = new RomantoInteger();
		r.convert("XIIV");
		
	}

}
