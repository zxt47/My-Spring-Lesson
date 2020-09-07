package com.xtzhou.cloud.demo.hutool;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.LocalDateTimeUtil;
import cn.hutool.core.util.ObjectUtil;

import java.time.LocalDate;

/**
 * @author Zhouxiaotian
 * @date
 * @since
 */
public class HutoolDemo {

	/**
	 * @param t
	 * @param <T>
	 * @return
	 */
	public <T> T deepClone(T t) {
		return ObjectUtil.cloneByStream(t);
	}

	public LocalDate convertToDate() {
		return LocalDateTimeUtil.parse("2020-12-31", DatePattern.NORM_DATE_PATTERN).toLocalDate();
	}

}
