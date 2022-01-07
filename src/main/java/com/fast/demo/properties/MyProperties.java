package com.fast.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

//@Configuration - 생략하기 위해서는 main쪽에서 @ConfigurationPropertiesScan을 이용하여
//                 검색할 빈 패키지경로를 명시적으로 알려주어야 한다.
// @ConstructorBinding을 이용한 immutable한 프로퍼티 객체 생성
@ConstructorBinding
@ConfigurationProperties("test")
public class MyProperties {
    private final String  value;
    private final String finalvalue;

    public MyProperties(String value, String finalvalue) {
        this.value = value;
        this.finalvalue = finalvalue;
    }

    public String getValue() {
        return value;
    }

    public String getFinalvalue() {
        return finalvalue;
    }

}