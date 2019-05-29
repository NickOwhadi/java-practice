package exCodingBath;

public class MethodAnagram {

 public static boolean isAnagram(String word1, String word2) {
    word1=word1.replaceAll(" ", "");
    word2=word2.replaceAll(" ", "");
    word1=word1.toLowerCase();
    word2=word2.toLowerCase();
    
     if (word1.length() != word2.length())
            return false;

        if (word1.equals(word2))
            return true;

        if (word1.length() == 0 && word2.length() == 0)
            return true;

        String secondWord = word2;
        for (int i = 0; i < word1.length(); i++) {
            if (secondWord.indexOf(word1.charAt(i)) == -1)
                return false;

            secondWord = secondWord.replaceFirst(word1.charAt(i) + "", "");
        }

        if (secondWord.length() > 0)
            return false;

        return true;
}
}