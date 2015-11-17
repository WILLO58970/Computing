package Computing;

public class usingEquals {
	public static void main(String[] args) {
			String longPhraseOne= "floxinoxinihilipilification";
			String longPhraseTwo= "floxinoxinihilipilification";
			String longPhraseThree= "fdashjvasdhbjsadhbjasdhj";
			String longPhraseFour= new String("floxinoxinihilipilification");
			
			System.out.println("Does The First Phrase equal the Second? ");
			System.out.println(longPhraseOne.equals(longPhraseTwo));
			System.out.println();
			System.out.println("Does The First Phrase equal the Second? ");
			System.out.println(longPhraseOne==(longPhraseTwo));
			System.out.println();
			System.out.println("Does The First Phrase equal the Forth? ");
			System.out.println(longPhraseOne==(longPhraseFour));
			System.out.println();
			String PhraseOne = longPhraseOne;
			PhraseOne= PhraseOne.substring(15);
			System.out.println(PhraseOne);
	}
}
