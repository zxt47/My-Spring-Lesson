package com.xtzhou.cloud.demo.cucumber;

import io.cucumber.core.cli.Main;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author zxt
 * @version 1.0
 * @date 2020/9/7 17:09
 * @since 1.0
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:demo.feature", glue = "com.xtzhou.cloud.demo.cucumber", plugin = {"junit:target/cucumber-report.xml",
        "json:target/cucumber-report.json", "pretty", "summary", "html:target/site/cucumber"},
        monochrome = true)
public class CucumberDemoTest {
    public static void main(String[] args) {
        Main.run(args, Thread.currentThread().getContextClassLoader());
    }
}
