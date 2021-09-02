package collection;

import java.util.Objects;

public class ArrayList {
    private final int[] ints;

    private ArrayList(final int[] ints) {
        this.ints = ints;
    }

    public static ArrayList create() {
        return new ArrayList(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    public void printHash() {
        for (int asInt : ints) {
            System.out.println(Objects.hash(asInt));
        }
    }
}
