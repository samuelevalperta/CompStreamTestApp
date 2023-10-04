package it.unibs.pajc;

import java.util.*;
public class CompStreamAppTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a2", "b1", "c1", "c2");

        // This is stateless
        list
                .stream()
                .map((a) -> {
                    System.out.printf("\nLOG: MAP: %s", a);
                    return a.toUpperCase();
                })
                .filter((a) -> {
                    System.out.printf("\nLOG: FLT: %s", a);
                    return !((String) a).startsWith("B");
                })
                .forEach((s) -> System.out.printf("\nOUTPUT: %s", s));

    }
}
