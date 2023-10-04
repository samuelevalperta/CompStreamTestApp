package it.unibs.pajc;

import java.util.*;
public class CompStreamAppTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a2", "b1", "c1", "c2");

        for (String s: list
             ) {
            if (!s.startsWith("b")) {
                System.out.println(s);
            }
        }
    }
}
