package strings;

public class RemoveSpecifiedCharacters {

	//Considering strings to be ASCII
	public static String removeSpecifiedCharacters(String str, String remove){
		boolean buffer[] = new boolean[128];
		char r[] = remove.toCharArray();
		char s[] = str.toCharArray();
		
		int i,j = 0;
		
		for(i = 0; i < r.length; i++){
			buffer[r[i]] = true;
		}

		for (i = 0; i < s.length; i++) {
			if(buffer[s[i]] == false) {
				s[j] = s[i];
				j++;
			} 
		}
		
		return new String(s, 0, j);
	}

	public static void main(String[] args) {
		String str = "abrcudne";
		String remove = "bcde";

		System.out.println("Final: " + removeSpecifiedCharacters(str, remove));
	}
}
