package org.dangcat.notes.junit5.basic;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("fast")
@Tag("model")
class TestTagDemo {
    @Test
    @Tag("taxes")
    void testingTaxCalculation() {
    }
}
