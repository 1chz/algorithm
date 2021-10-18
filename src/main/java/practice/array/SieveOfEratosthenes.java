package practice.array;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import static java.lang.Math.toIntExact;
import static java.util.stream.IntStream.range;
import java.util.function.IntPredicate;

public class SieveOfEratosthenes {

    /*
    에라토스테네스의 체
    gif: src/main/resources/gif/Sieve_of_Eratosthenes_animation.gif

    소수는 1과 자기자신으로밖에 나눌수 없는 수를 의미한다.
    2,3,5,7...
    이 때 1은 기초수라 하여 소수에 포함하지 않는다.

    이를 간단하게 표현하면 2부터 n-1까지의 어떤 수로도 나누어지지 않는 수라고 볼 수 있으며
    에라토스테네스의 체는 소수로 나뉘어지지 않는 수 역시 소수라는 발상으로 시작한다.

    즉, 이미 구해놓은 소수를 이용하여 특정 범위까지의 모든 소수를 판별한다.
    이때, 약수는 대칭성을 가지므로 n의 제곱근만큼의 연산만 하면 된다.
    예를 들어 n=20일 때 20의 제곱근은 4.4이므로 반올림하여 4까지의 수만 나누어보면 된다.

    1은 기초수이므로 제외, 2는 소수이므로 2부터 n-1까지의 수를 모두 나누어보고, 나누어지는 수는 제거한다.
    3은 소수이므로 남아있는 수들을 3으로 모두 나누어보고 나누어지는 수는 제거한다.

    1부터 20까지의 수가 있다고 치자.

    1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

    2를 제외한 2의 배수를 모두 지운다.

    2 3 5 7 9 11 13 15 17 19

    3을 제외한 3의 배수를 모두 지운다.

    2 3 5 7 11 13 17 19

    소수는 총 8개다.
     */
    public long solution(final int value) {
        return range(2, value + 1) // value가 20일 경우 2~20까지의 수를 생성해야하는데, 레인지 함수는 인덱스 시작이 0부터이므로 +1 연산을 해준다.
            .filter(this::isPrimeNumber)
            .count();
    }

    private boolean isPrimeNumber(final int number) {
        return range(2, getRangeEnd(number) + 1) // 레인지 함수는 인덱스 시작이 0부터이므로 +1 연산을 해준다.
            .noneMatch(divisorOf(number));
    }

    private int getRangeEnd(final int number) {
        return toIntExact(round(sqrt(number)));
    }

    private IntPredicate divisorOf(final int number) {
        return divider -> number % divider == 0;
    }

}
