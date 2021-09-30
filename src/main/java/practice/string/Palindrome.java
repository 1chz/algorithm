package practice.string;

public class Palindrome {

    public boolean solution(final String sentence) {
        return sentence.equalsIgnoreCase(new StringBuilder(sentence).reverse().toString());
    }

}
