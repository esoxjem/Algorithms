package strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	// unicode
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
	
	public static void main(String[] args) {
		String str = "supercalifragilisticexpialidocious";
		System.out.println("first non rep char: " + firstNonRepeatedUnicodeCharacter(str));
	}
}
