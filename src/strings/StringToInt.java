package strings;

public class StringToInt {

	public static int stringToInt(String str) {
		int length = str.length();
		int num = 0, i = 0;
		boolean isNeg = false;

		if (str.charAt(0) == '-') {
			isNeg = true;
			i = 1;
		}

		while (i < length) {
			num *= 10;
			num += (str.charAt(i) - '0');
			i++;
		}

		if (isNeg) {
			num = -num;
		}

		return num;
	}

	public static void main(String[] args) {
		String str = "012345";
		System.out.println("int value: " + stringToInt(str));
	}
}