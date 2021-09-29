package programmers;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <pre>
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/42577?language=java
 *
 * 풀이:
 * String 의 비교는 compareTo 를 사용합니다.
 * 내부적으로 두 문자열 중 길이가 작은 문자열의 길이까지 for 문으로 char 비교를 수행합니다.
 * 반복문 중 값이 다르면 char 로 비교되고, 해당 길이까지 동등하다면 두 길이를 비교하는 방법입니다.
 * char 의 값은 a, b, c, d 알파벳순으로 나열되어 있습니다.
 * 이에 String 은 알파벳순 비교 후 길이로 비교되므로 사전순으로 반환됩니다.
 * 여기서 정렬에 사용된 Arrays.sort(Object[] o) 에서도 compareTo 를 사용하도록 명시되어 Arrays.sort(String[] s) 는 사전순으로 정렬됩니다.
 * 즉 "12", "1223", "123", "13", "139", "140" 과 같은 순서이기에 직전의 값이 다음 값에 포함되지 않으면 그 다음값은 당연히 연속된 문자가 아닙니다.
 *
 * 풀이의 시간복잡도는 배열을 한번 순회하면 끝나므로 O(n)입니다.
 * </pre>
 */
@DisplayName("프로그래머스 42577 - 전화번호 목록")
class Programmers42577Test {

    private Programmers42577 solve = new Programmers42577();

    @MethodSource
    @ParameterizedTest
    void solution(final String[] phoneBook, final boolean expected) throws Exception {
        final boolean actual = solve.solution(phoneBook);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new String[]{"119", "97674223", "1195524421"}, false),
            Arguments.of(new String[]{"123", "456", "789"}, true),
            Arguments.of(new String[]{"12", "123", "1235", "567", "88"}, false)
        );
    }

}