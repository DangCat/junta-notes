/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package org.dangcat.notes.junit5.junit4tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnit4Test {

    @Test
    public void test() {
        assertEquals(3, 1 + 2);
    }
}
