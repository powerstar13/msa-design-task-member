package study.msa.msadesigntaskmember.presentation.member;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import study.msa.msadesigntaskmember.infrastructure.config.WebFluxRouterConfig;
import study.msa.msadesigntaskmember.application.certification.response.CertificationResponse;
import study.msa.msadesigntaskmember.application.login.response.LoginResponse;
import study.msa.msadesigntaskmember.application.student.response.StudentRegistrationResponse;
import study.msa.msadesigntaskmember.application.teacher.response.TeacherRegistrationResponse;

@SpringBootTest
class MemberHandlerTest {

    private WebTestClient webTestClient;

    @Autowired
    private WebFluxRouterConfig webFluxRouterConfig;
    @Autowired
    private MemberHandler memberHandler;

    @BeforeEach
    void setUp() {
        webTestClient = WebTestClient
            .bindToRouterFunction( // WebFluxConfig에서 작성한 router를 WebTestClient에 바인딩해준다.
                webFluxRouterConfig.routerBuilder(memberHandler)
            )
            .build();
    }

    /**
     * 강사 등록
     */
    @Test
    void teacherRegistration() {

        webTestClient
            .post()
            .uri("/member/teacherRegistration")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody(TeacherRegistrationResponse.class);
    }

    /**
     * 학생 회원 등록
     */
    @Test
    void studentRegistration() {

        webTestClient
            .post()
            .uri("/member/studentRegistration")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody(StudentRegistrationResponse.class);
    }

    /**
     * 로그인
     */
    @Test
    void login() {

        webTestClient
            .post()
            .uri("/member/login")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody(LoginResponse.class);
    }

    /**
     * 권한 확인
     */
    @Test
    void certification() {

        webTestClient
            .post()
            .uri("/member/certification")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody(CertificationResponse.class);
    }
}