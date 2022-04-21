package study.msa.msadesigntaskmember.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import study.msa.msadesigntaskmember.presentation.member.MemberHandler;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@EnableWebFlux // WebFlux 설정 활성화
public class WebFluxRouterConfig implements WebFluxConfigurer {

    @Bean
    public RouterFunction<ServerResponse> routerBuilder(MemberHandler handler) {

        return route()
            .path("/member", helloBuilder ->
                helloBuilder.nest(accept(APPLICATION_JSON), builder ->
                    builder
                        .POST("/teacherRegistration", handler::teacherRegistration) // 강사 등록
                        .POST("/studentRegistration", handler::studentRegistration) // 학생 회원 가입
                        .POST("/login", handler::login) // 로그인
                        .POST("/certification", handler::certification) // 권한 확인
                )
            )
            .build();
    }
}
