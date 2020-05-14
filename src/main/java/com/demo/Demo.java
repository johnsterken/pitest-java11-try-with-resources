package com.demo;

import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public String tryWithRecources(List<String> strings) {
        try (Stream<String> first = strings.stream()) {
            return first.findFirst()
                    .orElse("bye");
        }
    }
}
