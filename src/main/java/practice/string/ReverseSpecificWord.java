package practice.string;

public class ReverseSpecificWord {

    public String solution(final String sentence) {
        char[] chars = sentence.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }
        
        return String.valueOf(chars);
    }

}
