package com.xtzhou.cloud.demo.cucumber;

import io.cucumber.java.zh_cn.假如;
import io.cucumber.java.zh_cn.当;
import io.cucumber.java.zh_cn.那么;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CucumberDemoGlue {
    @假如("there are {int} cucumbers")
    public void there_are_cucumbers(Integer int1) {
        log.info("{}", int1);
    }

    @当("I eat {int} cucumbers")
    public void i_eat_cucumbers(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        log.info("{}", int1);
    }


    @那么("I should have {int} cucumbers")
    public void i_should_have_cucumbers(Integer int1) {
        log.info("那么结果是{}", int1);
    }

}
