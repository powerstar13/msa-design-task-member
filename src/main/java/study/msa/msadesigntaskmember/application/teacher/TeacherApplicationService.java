package study.msa.msadesigntaskmember.application.teacher;

import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntaskmember.application.teacher.response.TeacherRegistrationResponse;

public interface TeacherApplicationService {

    TeacherRegistrationResponse teacherRegistration(ServerRequest request); // 강사 등록
}
