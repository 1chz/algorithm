package practice.string;

public class Palindrome {

    public boolean solution(final String sentence) {
        final String reverseSentence = new StringBuilder(sentence).reverse().toString();
        return sentence.equalsIgnoreCase(reverseSentence);
    }

    public boolean solution2(String sentence) {
        sentence = sentence.toLowerCase();
        int len = sentence.length();
        int endIndex = len - 1;
        for (int lt = 0; lt < len / 2; lt++) {
            int rt = endIndex - lt;
            char ltCharAt = sentence.charAt(lt);
            char rtCharAt = sentence.charAt(rt);
            if (ltCharAt != rtCharAt) {
                return false;
            }
        }
        return true;
    }

}
