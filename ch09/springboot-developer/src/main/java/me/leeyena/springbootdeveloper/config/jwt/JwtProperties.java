package me.leeyena.springbootdeveloper.config.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("jwt") //자바 클래스에 프로퍼티 값을 가져와 사용하는 애노테이션
public class JwtProperties {
    private String issuer;
    private String secretKey;
}
