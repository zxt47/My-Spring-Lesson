package com.xtzhou.cloud.demo.truth;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

public class TruthTestDemo {

	@Test
	public void testTruth() {
		String string = "awesome";
		assertThat(string).startsWith("awe");
		// string = "aweso";
		assertWithMessage("Without me, it's just aweso").that(string).contains("me");
	}

}
