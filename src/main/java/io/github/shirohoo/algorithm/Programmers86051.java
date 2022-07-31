package io.github.shirohoo.algorithm;

import java.util.Arrays;

public class Programmers86051 {
    public int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }
}
