package org;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {
    @Test
    void SomeFailingTest() {
       Assertions.assertThat(true).isFalse();
    }
}
