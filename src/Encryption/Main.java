package Encryption;
public class Main{
    public static void main(String[] args)
    {
        String inputText = "UQTG IQVJGT KU CFQRVGF";
        
        int startOffset = (int) 'A';
        //int cypherKey = 22;
        for(int cypherKey = 1;cypherKey<26;cypherKey++){
        for (int i = 0; i < inputText.length(); i++)
        {
            int character = (int) inputText.charAt(i);
            
            if (character != (int) ' ')
            {
                character = ((character - startOffset) + cypherKey) % 26 + startOffset;
            }
            
            System.out.print((char) character);            
        }
        System.out.println();
        }

    }
}