package practice.array;

import static java.util.Arrays.stream;
import java.util.stream.Collectors;

public class ReversePrimeNumber {

    public String solution(final String testCase) {
        return stream(testCase.split(" "))
            .map(StringBuilder::new)
            .map(StringBuilder::reverse)
            .map(StringBuilder::toString)
            .map(Integer::valueOf)
            .filter(this::isPrimeNumber)
            .map(String::valueOf)
            .collect(Collectors.joining(" "));
    }

    private boolean isPrimeNumber(final int number) {
        if (number == 1) { // 1은 기초수이므로 소수가 아니다
            return false;
        }

        int divisor = 2;
        while (divisor * divisor <= number) { // 약수는 대칭성을 보이므로 n의 제곱근만큼 순회하면 모든 약수를 판별할 수 있다
            if (number % divisor == 0) { // 1과 자기자신을 제외한 어떤수로도 나누어 떨어지기만 하면 소수가 아님
                return false;
            }
            divisor++; // 나누어 떨어지지 않았다면 약수를 1증가시키고 다음 루프를 시작한다
        }
        return true; // number 의 제곱근만큼 순회하며 모두 나누었음에도 나누어 떨어지지 않았다면 소수이다
    }

}
