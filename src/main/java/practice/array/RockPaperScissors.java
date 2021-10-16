package practice.array;

import static java.util.Arrays.stream;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RockPaperScissors {

    public String solution(final int a, final int b) {
        final RockPaperScissor aByValue = RockPaperScissor.findByValue(a);
        final RockPaperScissor bByValue = RockPaperScissor.findByValue(b);
        return aByValue.game(bByValue);
    }

    private enum RockPaperScissor {
        SCISSOR(1, "가위") {
            @Override
            String game(final RockPaperScissor rockPaperScissor) {
                if (rockPaperScissor.isPaper()) {
                    return Result.A.name();
                }
                if (rockPaperScissor.isRock()) {
                    return Result.B.name();
                }
                return Result.D.name();
            }
        },
        ROCK(2, "바위") {
            @Override
            String game(final RockPaperScissor rockPaperScissor) {
                if (rockPaperScissor.isScissor()) {
                    return Result.A.name();
                }
                if (rockPaperScissor.isPaper()) {
                    return Result.B.name();
                }
                return Result.D.name();
            }
        },
        PAPER(3, "보") {
            @Override
            String game(final RockPaperScissor rockPaperScissor) {
                if (rockPaperScissor.isRock()) {
                    return Result.A.name();
                }
                if (rockPaperScissor.isScissor()) {
                    return Result.B.name();
                }
                return Result.D.name();
            }
        },
        ;

        private static final Map<Integer, RockPaperScissor> MAP = stream(values())
            .collect(Collectors.toUnmodifiableMap(RockPaperScissor::getValue, Function.identity()));

        private final int value;
        private final String description;

        RockPaperScissor(final int value, final String description) {
            this.value = value;
            this.description = description;
        }

        private static RockPaperScissor findByValue(final int value) {
            if (!MAP.containsKey(value)) {
                throw new NoSuchElementException();
            }
            return MAP.get(value);
        }

        abstract String game(final RockPaperScissor rockPaperScissor);

        private int getValue() {
            return value;
        }

        private boolean isScissor() {
            return value == 1;
        }

        private boolean isRock() {
            return value == 2;
        }

        private boolean isPaper() {
            return value == 3;
        }

    }

    private enum Result {
        A, B, D;
    }

}
