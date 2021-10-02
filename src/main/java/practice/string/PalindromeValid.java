package practice.string;

public class PalindromeValid {

    public boolean solution(String sentence) {
        sentence = sentence.toLowerCase()
            .replaceAll("[^a-z]", "");

        return sentence.equals(
            new StringBuilder(sentence)
                .reverse()
                .toString()
        );
    }

}
