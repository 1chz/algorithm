package io.github.shirohoo.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Programmers92334 {
    public int[] solution(String[] idList, String[] reports, int k) {
        Map<String, Set<String>> map = new HashMap<>();

        for (String report : reports) {
            String[] split = report.split(" ");

            String reporter = split[0];
            String reported = split[1];

            if (map.containsKey(reported)) {
                map.get(reported).add(reporter);
            } else {
                HashSet<String> set = new HashSet<>();
                set.add(reporter);
                map.put(reported, set);
            }
        }

        int[] answer = new int[idList.length];

        for (String key : map.keySet()) {
            Set<String> values = map.get(key);
            if (values.size() >= k) {
                for (int i = 0; i < idList.length; i++) {
                    String id = idList[i];
                    if (values.contains(id)) {
                        answer[i]++;
                    }
                }
            }
        }

        return answer;
    }
}
