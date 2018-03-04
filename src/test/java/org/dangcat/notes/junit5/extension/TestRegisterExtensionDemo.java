package org.dangcat.notes.junit5.extension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class TestRegisterExtensionDemo {
    @RegisterExtension
    private TimingExtension timingExtension = new TimingExtension();

    @Test
    void testRegisterExtensionDemo() {

    }
}
