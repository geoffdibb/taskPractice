import java.util.HashMap;

public class HashMorse {

	public static void main(String[] args) {

		morseCodeTranslator();
	}

	public static void morseCodeTranslator() {

		HashMap<String, String> theTranslator = new HashMap<>();

		theTranslator.put(".-", "a");
		theTranslator.put("-...", "b");
		theTranslator.put("-.-.", "c");
		theTranslator.put("-..", "d");
		theTranslator.put(".", "e");
		theTranslator.put("..-.", "f");
		theTranslator.put("--.", "g");
		theTranslator.put("....", "h");
		theTranslator.put("..", "i");
		theTranslator.put(".---", "j");
		theTranslator.put("-.-", "k");
		theTranslator.put(".-..", "l");
		theTranslator.put("--", "m");
		theTranslator.put("-.", "n");
		theTranslator.put("---", "o");
		theTranslator.put(".--.", "p");
		theTranslator.put("--.-", "q");
		theTranslator.put(".-.", "r");
		theTranslator.put("...", "s");
		theTranslator.put("-", "t");
		theTranslator.put("..-", "u");
		theTranslator.put("...-", "v");
		theTranslator.put(".--", "w");
		theTranslator.put("-..-", "x");
		theTranslator.put("-.--", "y");
		theTranslator.put("--..", "z");
		theTranslator.put(".----", "1");
		theTranslator.put("..----", "2");
		theTranslator.put("...---", "3");
		theTranslator.put("....-", "4");
		theTranslator.put(".....", "5");
		theTranslator.put("-....", "6");
		theTranslator.put("--...", "7");
		theTranslator.put("---..", "8");
		theTranslator.put("----.", "9");
		theTranslator.put("-----", "0");

		String phrase = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";

		String wordSplitter[] = phrase.split(" / ");
		for (int i = 0; i < wordSplitter.length; i++) {

			String letterSplitter[] = wordSplitter[i].split(" ");
			for (int j = 0; j < letterSplitter.length; j++) {

				System.out.print(theTranslator.get(letterSplitter[j]));
			}
			System.out.print(" ");
		}
		System.out.println(".");

		System.out.print(theTranslator.get("...."));
		System.out.print(theTranslator.get("."));
		System.out.print(theTranslator.get(".-.."));
		System.out.print(theTranslator.get(".-.."));
		System.out.print(theTranslator.get("---"));
		System.out.print(" ");
		System.out.print(theTranslator.get("-.."));
		System.out.print(theTranslator.get(".-"));
		System.out.print(theTranslator.get(".."));
		System.out.print(theTranslator.get(".-.."));
		System.out.print(theTranslator.get("-.--"));
		System.out.print(" ");
		System.out.print(theTranslator.get(".--."));
		System.out.print(theTranslator.get(".-."));
		System.out.print(theTranslator.get("---"));
		System.out.print(theTranslator.get("--."));
		System.out.print(theTranslator.get(".-."));
		System.out.print(theTranslator.get(".-"));
		System.out.print(theTranslator.get("--"));
		System.out.print(theTranslator.get("--"));
		System.out.print(theTranslator.get("."));
		System.out.print(theTranslator.get(".-."));
		System.out.print(" ");
		System.out.print(theTranslator.get("--."));
		System.out.print(theTranslator.get("---"));
		System.out.print(theTranslator.get("---"));
		System.out.print(theTranslator.get("-.."));
		System.out.print(" ");
		System.out.print(theTranslator.get(".-.."));
		System.out.print(theTranslator.get("..-"));
		System.out.print(theTranslator.get("-.-."));
		System.out.print(theTranslator.get("-.-"));
		System.out.print(" ");
		System.out.print(theTranslator.get("---"));
		System.out.print(theTranslator.get("-."));
		System.out.print(" ");
		System.out.print(theTranslator.get("-"));
		System.out.print(theTranslator.get("...."));
		System.out.print(theTranslator.get("."));
		System.out.print(" ");
		System.out.print(theTranslator.get("-.-."));
		System.out.print(theTranslator.get("...."));
		System.out.print(theTranslator.get(".-"));
		System.out.print(theTranslator.get(".-.."));
		System.out.print(theTranslator.get(".-.."));
		System.out.print(theTranslator.get("."));
		System.out.print(theTranslator.get("-."));
		System.out.print(theTranslator.get("--."));
		System.out.print(theTranslator.get("."));
		System.out.print(theTranslator.get("..."));
		System.out.print(" ");
		System.out.print(theTranslator.get("-"));
		System.out.print(theTranslator.get("---"));
		System.out.print(theTranslator.get("-.."));
		System.out.print(theTranslator.get(".-"));
		System.out.print(theTranslator.get("-.--"));

	}

}
