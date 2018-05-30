package ds.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	// unicode char set
	public static String firstNonRepeatedUnicodeCharacter(String str) {

		int cp, i;
		int length = str.length();
		Object seenOnce = new Object();
		Object seenMultiple = new Object();

		Map<Integer, Object> map = new HashMap<Integer, Object>();

		for (i = 0; i < length;) {
			cp = str.codePointAt(i);
			i += Character.charCount(cp);

			if (map.get(cp) == null) {
				map.put(cp, seenOnce);
			} else if (map.get(cp) == seenOnce) {
				map.put(cp, seenMultiple);
			}
		}

		for (i = 0; i < length;) {
			cp = str.codePointAt(i);
			i += Character.charCount(cp);

			if (map.get(cp) == seenOnce) {
				return new String(Character.toChars(cp));
			}
		}

		return null;
	}
	
	//ASCII char set
	public static String firstNonRepeatedASCIICharacter(String str){
		
		char c;
		int i, length = str.length();
		int count[] = new int[128];
		
		for(i = 0; i < length; i++){
			c = str.charAt(i);
			if(count[c] == 0){
				count[c] = 1;
			} else {
				count[c] += 1;
			}
		}
		
		for(i = 0; i < length; i++){
			c = str.charAt(i);
			if(count[c] == 1){
				return new String(Character.toString(c));
			}
		}	
		return null;
	}
	
	
	public static void main(String[] args) {
		String str = "supercalifragilisticexpialidocious";
		System.out.println("first non rep unicode char: " + firstNonRepeatedUnicodeCharacter(str));
		System.out.println("first non rep ASCII char: " + firstNonRepeatedASCIICharacter(str));
	}
}
