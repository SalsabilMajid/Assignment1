//Write a short Java method that counts the number of vowels in a given character string.

public class Q15 {
    public static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);  // استخراج الحرف الحالي

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(countVowels("Salsabil"));

    }
}
