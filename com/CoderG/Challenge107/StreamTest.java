package com.CoderG.Challenge107;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Awadhesh","Sanyog","Ankit");
        names.stream().forEach(name -> System.out.println(name));
    }
}
