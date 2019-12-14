package com.tulip.code.utils.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 项目常量类
 *
 * @author yangfan
 */
@Component
@PropertySource(value = "classpath:constants.yml", encoding = "utf-8")
public class Constants {
    public static String USER_SESSION_KEY;

    public static String DEFAULT_PASSWORD;

    @Value("${userSessionKey}")
    public void setUSER_SESSION_KEY(String userSessionKey) {
        USER_SESSION_KEY = userSessionKey;
    }

    @Value("${defaultPassword}")
    public void setDefaultPassword(String defaultPassword) {
        DEFAULT_PASSWORD = defaultPassword;
    }
}


