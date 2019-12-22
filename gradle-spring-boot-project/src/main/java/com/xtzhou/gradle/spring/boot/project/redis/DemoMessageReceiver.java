package com.xtzhou.gradle.spring.boot.project.redis;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;

/**
 *
 */
public class DemoMessageReceiver {
    private static final Logger logger = LoggerFactory.getLogger(DemoMessageReceiver.class);

    private CountDownLatch latch;

    @Autowired
    public DemoMessageReceiver(CountDownLatch latch) {
        this.latch = latch;
    }

    public void receiveMessage(String message) {
        logger.info("Received <" + message + ">");
        latch.countDown();
    }
}
