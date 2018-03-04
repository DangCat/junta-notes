package org.dangcat.notes.junit5.conditional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;

import static org.junit.jupiter.api.condition.JRE.*;

class TestJREConditionsDemo {
    @Test
    @EnabledOnJre(JAVA_8)
    void onlyOnJava8() {
        // ...
    }

    @Test
    @EnabledOnJre({JAVA_9, JAVA_10})
    void onJava9Or10() {
        // ...
    }

    @Test
    @DisabledOnJre(JAVA_9)
    void notOnJava9() {
        // ...
    }
}
