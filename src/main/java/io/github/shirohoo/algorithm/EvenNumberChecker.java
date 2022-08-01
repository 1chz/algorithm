package io.github.shirohoo.algorithm;

public class EvenNumberChecker {
    public boolean check(int number) {
        return (number & 1) == 0;
    }
}
