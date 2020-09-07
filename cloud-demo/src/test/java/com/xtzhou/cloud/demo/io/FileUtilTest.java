package com.xtzhou.cloud.demo.io;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

@Slf4j
public class FileUtilTest {
    @Test
    public void readFileFromPath() {
        log.info("{}", System.getProperty("user.dir"));
        File file = new File("config/test.properties");
        Assert.assertTrue(file.exists());
    }
}
