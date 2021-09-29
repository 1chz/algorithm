package practice.string;

public class ConvertLowerUpper {

    public String solution(final String charSequence) {
        String answer = "";

        for (char c : charSequence.toCharArray()) {
            if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
        }

        return answer;
    }

}
