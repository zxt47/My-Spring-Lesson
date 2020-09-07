package com.xtzhou.cloud.demo.domain;

import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.tuple.MutablePair;

import java.io.Serializable;

/**
 * @author Zhouxiaotian
 * @version 1.0
 * @date 2020/9/3 16:14
 * @since 1.0
 */
@Data
@Builder
public class User implements Serializable {
    MutablePair<String, String> pair;
    private String address;
    private String name;
    private Character[] password;
}
