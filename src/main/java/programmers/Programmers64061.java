package programmers;

import java.util.Stack;

public class Programmers64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int position : moves) {
            for (int depth = 0; depth < board.length; depth++) {
                if (board[depth][position - 1] != 0) {
                    int temp = board[depth][position - 1];
                    board[depth][position - 1] = 0;
                    if (!stack.isEmpty() && temp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(temp);
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
