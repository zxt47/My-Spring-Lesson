package com.xtzhou.cloud.demo.hutool;

import com.xtzhou.cloud.demo.domain.User;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Zhouxiaotian
 * @version 1.0
 * @date 2020/9/3 15:59
 * @since 1.0
 */
public class HutoolDemoTest {
    private HutoolDemo hutoolDemo = new HutoolDemo();

    @Test
    public void testdeepclone() {
        User user = User.builder().name("周笑天").address("酒仙桥").password(new Character[]{'1', '3'}).build();
        User copieduser = hutoolDemo.deepClone(user);
        Assert.assertEquals(user, copieduser);
    }
}
