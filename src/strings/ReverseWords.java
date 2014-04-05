package strings;

class ReverseWords{

	public static String reverseWords(String str){
		char s[] = str.toCharArray();
		int length = s.length;
		int i = 0, j = 0;

		reverseString(s, i, length - 1);

		for (i = 0, j = 0; i < length; i++) {
			if(s[i] == ' '){
				reverseString(s, j, i - 1);
				j = i;
				j++;
			}
		}
		
		return new String(s, 0, length);
	}

	private static void reverseString(char arr[], int i, int j){
		while (i < j){
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		String str = "I am Arun!";
		System.out.println("Reversed: " + reverseWords(str));
	}
}