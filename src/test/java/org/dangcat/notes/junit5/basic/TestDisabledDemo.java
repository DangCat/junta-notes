package org.dangcat.notes.junit5.basic;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestDisabledDemo {
    @Disabled
    @Test
    void testWillBeSkipped() {
    }

    @Test
    void testWillBeExecuted() {
    }
}
