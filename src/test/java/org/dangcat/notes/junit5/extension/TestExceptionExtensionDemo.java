package org.dangcat.notes.junit5.extension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;

@ExtendWith(IgnoreIOExceptionExtension.class)
class TestExceptionExtensionDemo {
    @Test
    void testExceptionExtension() throws IOException {
        throw new IOException("The file is not found.");
    }
}
