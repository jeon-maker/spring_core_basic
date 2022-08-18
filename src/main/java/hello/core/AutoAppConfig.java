package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
@ComponentScan(
        //basePackages = "hello.core.member", // 이게 없으면 모든 자바 코드를 다 뒤진다.
        basePackageClasses = AutoAppConfig.class, // 클래스의 패키지를 시작 위치로 지정.
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
