package org.foobarqix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooBarQixTest {


    @Test
    public void given_1_then_return_1() {
     String actual = processFooBarQix(1);

     //assertThat(actual).isEqualTo("1");
    }

    private String processFooBarQix(int i) {
        return "1";
    }
}
