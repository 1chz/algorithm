package practice.array;

import static java.lang.Math.toIntExact;
import java.util.stream.IntStream;

public class SieveOfEratosthenes {

    /*
    에라토스테네스의 체

    소수는 1과 자기자신으로밖에 나눌수 없는 수를 의미한다.
    2,3,5,7...
    이 때 1은 기초수라 하여 소수에 포함하지 않는다.
    
    이를 간단하게 표현하면 2부터 n-1까지의 어떤 수로도 나누어지지 않는 수라고 볼 수 있으며
    에라토스테네스의 체는 소수로 나뉘어지지 않는 수는 소수라는 발상으로 시작한다.
    
    즉, 이미 구해놓은 소수를 이용하여 특정 범위까지의 모든 소수를 판별한다.
    그런데 2와 3이 소수이면서 이 두수의 배수는 모두 짝수와 홀수이기 때문에 이 두 수로 특정 범위까지의 모든 수를 나눈 후 살아남은 수는 모두 소수가 된다.

    1부터 10까지의 수가 있다고 치자.

    1 2 3 4 5 6 7 8 9 10

    2의 배수를 모두 지운다.

    3 5 7 9

    3의 배수를 모두 지운다.

    5 7

    2와 3을 추가한다.

    2 3 5 7

    소수는 총 4개다.
     */
    public long solution(final long value) {
        return 2 + // 2, 3도 소수이기 때문에 두 개를 포함
            IntStream.range(4, toIntExact(value + 1)) // value가 20일 경우 1~20까지의 수를 생성해야하는데, 시작이 0부터이므로 +1 연산을 해주고, 1~3은 연산에 필요없으므로 4부터 시작한다.
                .filter(number -> number != 1 && number % 2 != 0 && number % 3 != 0) // 1은 기초수라고 하여 소수에 포함하지 않는다
                .count();
    }

}
