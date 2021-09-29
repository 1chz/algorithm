package practice.string;

public class WordInSentence {

    public String solution(final String sentence) {
        int len = Integer.MIN_VALUE;
        String answer = "";

        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() > len) {
                len = word.length();
                answer = word;
            }
        }
        return answer;
    }

}
