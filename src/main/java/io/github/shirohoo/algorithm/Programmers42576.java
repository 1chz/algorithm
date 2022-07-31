package io.github.shirohoo.algorithm;

import java.util.Arrays;

// 테스트 코드 참고
public class Programmers42576 {

    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participant.length - 1; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length - 1];
    }

}
