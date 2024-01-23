package ex4;

public class ConcatChars {
	public static void main(String[] args) {
		char letterA = 'A';
		char letterE = 'E';
		char letterI, letterO, letterU;
		letterI = 'I';
		letterO = 'O';
		letterU = 'U';
		
		// Doing this way java will sum the ascii values of the chars
		// System.out.println(letterA + letterE + letterI + letterO + letterU);
		// output: 371
		
		// So we add an empty string, to indicate java we need to concatenate
		System.out.println("" + letterA + letterE + letterI + letterO + letterU);
		
	}
}
