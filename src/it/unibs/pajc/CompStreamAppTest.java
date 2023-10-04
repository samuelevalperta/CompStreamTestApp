package it.unibs.pajc;

import java.util.*;
import java.util.stream.Stream;

public class CompStreamAppTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a2", "b1", "c1", "c2");

        // This is stateless
        Stream<String> myStream = list
                .stream()
                .map((a) -> {
                    System.out.printf("\nLOG: MAP: %s", a);
                    return a.toUpperCase();
                })
                .filter((a) -> {
                    System.out.printf("\nLOG: FLT: %s", a);
                    return !a.startsWith("B");
                });
                //.forEach((s) -> System.out.printf("\nOUTPUT: %s", s));

        myStream.forEach(s -> System.out.printf("\nOUTPUT: %s", s));

    }
}
