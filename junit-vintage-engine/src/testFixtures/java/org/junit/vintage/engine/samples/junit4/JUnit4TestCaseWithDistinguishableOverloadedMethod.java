/*
 * Copyright 2015-2022 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package org.junit.vintage.engine.samples.junit4;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;

/**
 * @since 5.5
 */
@RunWith(Theories.class)
public class JUnit4TestCaseWithDistinguishableOverloadedMethod {

	@Test
	public void test() {
		test("foo");
	}

	@SuppressWarnings("SameParameterValue")
	private void test(String message) {
		fail(message);
	}

}
