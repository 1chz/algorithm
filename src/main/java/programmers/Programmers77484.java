package programmers;

import java.util.Arrays;

public class Programmers77484 {

    public int[] solution(int[] lottos, int[] winNums) {
        long numberOfZero = Arrays.stream(lottos)
            .filter(num -> num == 0)
            .count();

        long matchCount = Arrays.stream(winNums)
            .filter(winNum -> Arrays.stream(lottos)
                .anyMatch(lotto -> winNum == lotto))
            .count();

        return new int[]{
            MatchPrize.getRank((int) (matchCount + numberOfZero)),
            MatchPrize.getRank((int) matchCount)
        };
    }

    private enum MatchPrize {
        FIRST(1, 6),
        SECOND(2, 5),
        THIRD(3, 4),
        FOURTH(4, 3),
        FIFTH(5, 2),
        SIXTH(6, 1);

        private final int rank;
        private final int matchCount;

        MatchPrize(int rank, int matchCount) {
            this.rank = rank;
            this.matchCount = matchCount;
        }

        private static int getRank(int matchCount) {
            return Arrays.stream(values())
                .filter(matchPrize -> matchPrize.matchCount == matchCount)
                .findFirst()
                .orElse(SIXTH)
                .rank;
        }

    }

}
