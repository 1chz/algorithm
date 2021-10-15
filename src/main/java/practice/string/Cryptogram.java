package practice.string;

public class Cryptogram {

    public String solution(final int charCount, String cryptogram) {
        String answer = "";
        for (int i = 0; i < charCount; i++) {
            String sliceString = cryptogram.substring(0, 7);
            answer += (char) Integer.parseInt(toBinaryString(sliceString), 2);
            cryptogram = cryptogram.substring(7);
        }
        return answer;
    }

    private String toBinaryString(final String cryptogram) {
        return cryptogram.replace("#", "1").replace("*", "0");
    }

}
