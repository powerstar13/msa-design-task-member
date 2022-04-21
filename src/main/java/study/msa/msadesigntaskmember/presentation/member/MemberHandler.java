package study.msa.msadesigntaskmember.presentation.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import study.msa.msadesigntaskmember.application.certification.CertificationApplicationService;
import study.msa.msadesigntaskmember.application.login.LoginApplicationService;
import study.msa.msadesigntaskmember.application.student.StudentApplicationService;
import study.msa.msadesigntaskmember.application.teacher.TeacherApplicationService;
import study.msa.msadesigntaskmember.application.certification.response.CertificationResponse;
import study.msa.msadesigntaskmember.application.login.response.LoginResponse;
import study.msa.msadesigntaskmember.application.student.response.StudentRegistrationResponse;
import study.msa.msadesigntaskmember.application.teacher.response.TeacherRegistrationResponse;
import study.msa.msadesigntaskmember.presentation.shared.response.ServerResponseFactory;

@Component
@RequiredArgsConstructor
public class MemberHandler {

    private final ServerResponseFactory serverResponseFactory;
    private final TeacherApplicationService teacherApplicationService;
    private final StudentApplicationService studentApplicationService;
    private final LoginApplicationService loginApplicationService;
    private final CertificationApplicationService certificationApplicationService;

    /**
     * 강사 등록
     * --> '사이트 운영자'는 강의 컨테츠를 업로드할 '강사' 회원을 생성할 수 있다.
     * @param request : 등록할 강사 정보
     * @return Mono<ServerResponse> : 등록된 강사 정보
     */
    public Mono<ServerResponse> teacherRegistration(ServerRequest request) {

        TeacherRegistrationResponse response = teacherApplicationService.teacherRegistration(request);

        return serverResponseFactory.successBodyValue(response);
    }

    /**
     * 학생 회원 가입
     * --> 강의를 수강하고자 하는 사람은 '학생'으로 회원 가입이 가능하다.
     * @param request : 가입할 학생 정보
     * @return Mono<ServerResponse> : 등록된 학생 회원 정보
     */
    public Mono<ServerResponse> studentRegistration(ServerRequest request) {

        StudentRegistrationResponse response = studentApplicationService.studentRegistration(request);

        return serverResponseFactory.successBodyValue(response);
    }

    /**
     * 로그인
     * @param request : 로그인 정보
     * @return Mono<ServerResponse> : 권한 인증 정보
     */
    public Mono<ServerResponse> login(ServerRequest request) {

        LoginResponse response = loginApplicationService.login(request);

        return serverResponseFactory.successBodyValue(response);
    }

    /**
     * 권한 확인
     * @param request : 권한 인증 정보
     * @return Mono<ServerResponse> : 인증 결과
     */
    public Mono<ServerResponse> certification(ServerRequest request) {

        CertificationResponse response = certificationApplicationService.certification(request);

        return serverResponseFactory.successBodyValue(response);
    }
}
