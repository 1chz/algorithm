package codingtest.skt;

import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Q1 {
    private static final int[] MONETARY_UNIT = {1, 5, 10, 50, 100, 500};

    public int solution(int money, int[] costs) {
        List<Struct> structs = IntStream.range(0, costs.length)
            .mapToObj(i -> new Struct(MONETARY_UNIT[i], costs[i]))
            .sorted(reverseOrder())
            .collect(toCollection(() -> new ArrayList<>(6)));

        int returnValue = 0;
        for (Struct struct : structs) {
            int count = money / struct.monetaryUnit;
            int totalCost = struct.productionCost * count;
            money -= count * struct.monetaryUnit;
            returnValue += totalCost;
        }
        return returnValue;
    }

    private static class Struct implements Comparable<Struct> {
        private int monetaryUnit;
        private int productionCost;
        private Double costPerformance;

        public Struct(int monetaryUnit, int productionCost) {
            this.monetaryUnit = monetaryUnit;
            this.productionCost = productionCost;
            this.costPerformance = (double) monetaryUnit / productionCost;
        }

        @Override
        public int compareTo(Struct s) {
            return costPerformance.compareTo(s.costPerformance);
        }
    }
}
