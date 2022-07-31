package io.github.shirohoo.algorithm;

import static java.util.Arrays.copyOfRange;
import static java.util.Arrays.stream;

public class Programmers42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int index = 0; index < commands.length; index++) {
            int[] command = commands[index];
            int i = command[0];
            int j = command[1];
            int k = command[2];
            int[] ints = stream(copyOfRange(array, i - 1, j)).sorted().toArray();
            answer[index] = ints[k - 1];
        }
        return answer;
    }
}
