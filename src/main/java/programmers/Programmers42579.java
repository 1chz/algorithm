package programmers;

import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Programmers42579 {
    public int[] solution(String[] genres, int[] plays) {
        return IntStream.rangeClosed(0, genres.length - 1)
                .mapToObj(toMusic(genres, plays))
                .collect(groupingBy(Music::getGenre))
                .entrySet().stream()
                .sorted(inOrderOfMostPlayedGenre())
                .flatMap(twoInOrderOfMostPlayed())
                .mapToInt(Music::getId)
                .toArray();
    }

    private IntFunction<Music> toMusic(String[] genres, int[] plays) {
        return i -> Music.of(i, genres[i], plays[i]);
    }

    private Comparator<Entry<String, List<Music>>> inOrderOfMostPlayedGenre() {
        return (entry1, entry2) -> sum(entry2.getValue()) - sum(entry1.getValue());
    }

    private Function<Entry<String, List<Music>>, Stream<? extends Music>> twoInOrderOfMostPlayed() {
        return entry -> entry.getValue()
                .stream()
                .sorted()
                .limit(2);
    }

    private int sum(List<Music> value) {
        return value.stream()
                .mapToInt(Music::getPlayed)
                .sum();
    }
    private static class Music implements Comparable<Music> {
        private final int id;
        private final String genre;
        private final int played;

        private Music(int id, String genre, int played) {
            this.id = id;
            this.genre = genre;
            this.played = played;
        }

        private static Music of(int id, String genre, int played) {
            return new Music(id, genre, played);
        }

        private int getId() {
            return id;
        }

        private String getGenre() {
            return genre;
        }

        private int getPlayed() {
            return played;
        }

        @Override
        public int compareTo(Music music) {
            if (this.played == music.played) {
                return this.id - music.id;
            }
            return music.played - this.played;
        }
    }
}
