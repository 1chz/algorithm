package practice.string;

public class ExtractNumbers {

    public int solution(final String charSequence) {
        String answer = "";
        for (char c : charSequence.toCharArray()) {
            if (Character.isDigit(c)) {
                answer += c;
            }
        }
        return Integer.parseInt(answer);
    }

}
