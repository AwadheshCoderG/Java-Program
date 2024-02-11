package com.CoderG.Challenge108;

import java.util.List;
public class StringFilterAndConcatenate {
    public static void main(String[] args) {


        List<String> strs = List.of("Coder_G is",
                "not", "learning java", "from best programmer",
                "on the platform");
        String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("", (a, b) -> a + " " + b);

        System.out.println(result);
    }
}
