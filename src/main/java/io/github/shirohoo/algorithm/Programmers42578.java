package io.github.shirohoo.algorithm;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class Programmers42578 {
    public int solution(String[][] clothes) {
        return stream(clothes)
            .collect(groupingBy(clothe -> clothe[1], mapping(clothe -> clothe[0], counting())))
            .values()
            .stream()
            .reduce(1L, (answer, numberOfClothes) -> answer * (numberOfClothes + 1))
            .intValue() - 1;
    }
}
