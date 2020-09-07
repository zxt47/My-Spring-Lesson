package com.xtzhou.cloud.demo.testng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

@Listeners(value = ExtendTestNGReporter.class)
public class TestNGDemoTest {

    @Test
    public void testNgDemo() {
        String string = "awesome";
        assertThat(string).startsWith("awe");
        // string = "aweso";
        assertWithMessage("Without me, it's just aweso").that(string).contains("me");

    }

}
