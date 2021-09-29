package practice;

public class FindChars {

    public int solution(String charSequence, char c) {
        int answer = 0;

        charSequence = charSequence.toUpperCase();
        c = Character.toUpperCase(c);

        for (char ch : charSequence.toCharArray()) {
            if (ch == c) {
                answer++;
            }
        }

        return answer;
    }

}
