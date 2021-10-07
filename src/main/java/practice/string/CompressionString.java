package practice.string;

public class CompressionString {

    public String solution(String s) {
        String answer = "";
        int cnt = 1;
        s = s + " ";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                answer += s.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }

}
