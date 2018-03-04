package org.dangcat.notes.junit5;

public interface Testable<T> {
    T createValue();
}