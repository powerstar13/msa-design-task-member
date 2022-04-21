package study.msa.msadesigntaskmember.application.student;

import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntaskmember.application.student.response.StudentRegistrationResponse;

public interface StudentApplicationService {

    StudentRegistrationResponse studentRegistration(ServerRequest request); // 학생 회원 가입
}
