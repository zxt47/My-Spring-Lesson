package com.xtzhou.cloud.demo.regex;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Zhouxiaotian
 */
@Slf4j
public class RegexDemo {

    private static Pattern pattern = Pattern.compile("(\\w+) \\1");

    public static void main(String[] args) {
        new RegexDemo().findTheSatisfiedCharacter();
    }

    public void findTheSatisfiedCharacter() {
        Matcher matcher = pattern.matcher("the little cat cat in the hat hat.");
        String s = matcher.group();
        log.info("{}", s);
    }

}
