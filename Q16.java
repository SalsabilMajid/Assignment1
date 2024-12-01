//Write a short Java method that uses a StringBuilder instance to remove all the punctuation from a strings
// storing a sentence, for example,transforming the string "Let’s try, Mike!" to "Lets try Mike".

public class Q16 {
    public static String removePunctuation(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String sentence = "Let’s try, Mike!";
        System.out.println(removePunctuation(sentence));

    }
}
