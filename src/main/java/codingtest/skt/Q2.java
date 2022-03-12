package codingtest.skt;

import java.util.List;

public class Q2 {
    private List<Cell> cells;
    private int[][] map;

    public int[][] solution(int n, boolean clockwise) {
        if (n == 1) {
            return new int[][]{{1}};
        }
        if (n == 2) {
            return new int[][]{{1, 1}, {1, 1}};
        }

        init(n, clockwise);

        marking(clockwise, 1, n - 1);

        return map;
    }

    private void init(int n, boolean clockwise) {
        map = new int[n][n];
        if (clockwise) {
            cells = List.of(
                new Cell(0, 0, Direction.RIGHT),
                new Cell(0, n - 1, Direction.DOWN),
                new Cell(n - 1, n - 1, Direction.LEFT),
                new Cell(n - 1, 0, Direction.UP)
            );
        } else {
            cells = List.of(
                new Cell(0, 0, Direction.DOWN),
                new Cell(0, n - 1, Direction.LEFT),
                new Cell(n - 1, n - 1, Direction.UP),
                new Cell(n - 1, 0, Direction.RIGHT)
            );
        }
    }

    private void marking(boolean clockwise, int markingCount, int markingNumber) {
        if (markingNumber <= 0) {
            return;
        }
        for (int i = 0; i < markingNumber; i++) {
            for (Cell cell : cells) {
                map[cell.x][cell.y] = markingCount;
            }
            if (i != markingNumber - 1) {
                for (Cell cell : cells) {
                    cell.changePosition();
                }
            }
            markingCount++;
        }
        for (Cell cell : cells) {
            cell.changeDir(clockwise);
            cell.changePosition();
        }
        marking(clockwise, markingCount, nextFrom(markingNumber));
    }

    private int nextFrom(int markingNumber) {
        return markingNumber == 2 || markingNumber == 3 ? 1
                                                        : markingNumber - 2;
    }

    private enum Direction {
        RIGHT,
        DOWN,
        LEFT,
        UP;

        private Direction nextBy(boolean clockWise) {
            if (clockWise) {
                switch (this) {
                    case RIGHT: return DOWN;
                    case DOWN: return LEFT;
                    case LEFT: return UP;
                    case UP: return RIGHT;
                }
            } else {
                switch (this) {
                    case RIGHT: return UP;
                    case DOWN: return RIGHT;
                    case LEFT: return DOWN;
                    case UP: return LEFT;
                }
            }
            throw new RuntimeException("never happens");
        }
    }

    private static class Cell {
        private int x;
        private int y;
        private Direction dir;

        private Cell(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        private void changeDir(boolean clockwise) {
            this.dir = dir.nextBy(clockwise);
        }

        private void changePosition() {
            switch (dir) {
                case RIGHT: y++; break;
                case DOWN: x++; break;
                case LEFT: y--; break;
                case UP: x--; break;
            }
        }
    }
}
