package pendu_tcp.util;

public class WordUtil {

	public static String encoding(String word) {
		StringBuilder wordEncoded = new StringBuilder("");

		for (int i = 0; i < word.length(); i++)
			wordEncoded.append("_");

		return wordEncoded.toString();
	}

	public static String check(String word, String wordEncoded, char lettre) {
		StringBuilder _wordEncoded = new StringBuilder(wordEncoded);

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == lettre)
				_wordEncoded.setCharAt(i, lettre);

		}

		return _wordEncoded.toString();
	}

}
