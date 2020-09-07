package com.xtzhou.cloud.demo.value;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("classpath:/application.properties")
@ConfigurationProperties
public class RpcDemoConfiguration {

	@Value("${configDir}")
	static String configdir;

	public static String getConfigdir() {
		return configdir;
	}

	public static void setConfigdir(String configdir) {
		RpcDemoConfiguration.configdir = configdir;
	}

}
