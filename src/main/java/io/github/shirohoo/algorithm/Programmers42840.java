package io.github.shirohoo.algorithm;

import java.util.*;
import java.util.stream.IntStream;

class Programmers42840 {
    public static final int[][] PATTERN = new int[][]{
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };

    public int[] solution(int[] answers) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= 3; i++) {
            int score = score(PATTERN[i - 1], answers);
            List<Integer> arr = map.getOrDefault(score, new ArrayList<>());
            arr.add(i);
            map.put(score, arr);
        }

        List<Integer> scores = new ArrayList<>(map.keySet());
        scores.sort(Collections.reverseOrder());

        List<Integer> topPeople = map.get(scores.get(0));
        int[] answer = new int[topPeople.size()];
        Arrays.setAll(answer, topPeople::get);
        return answer;
    }

    private int score(int[] people, int[] answers) {
        return IntStream.range(0, answers.length)
                .map(i -> people[i % people.length] == answers[i] ? 1 : 0)
                .sum();
    }
}
