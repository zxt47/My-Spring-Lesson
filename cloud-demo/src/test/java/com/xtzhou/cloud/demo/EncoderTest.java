package com.xtzhou.cloud.demo;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class EncoderTest {

    @Test
    public void ChineseEncoder() throws UnsupportedEncodingException {
        String s = new String("中文".getBytes("UTF-8"), "ISO-8859-1");
        System.out.println(s);
        String s1 = new String(s.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(s1);
    }

}
