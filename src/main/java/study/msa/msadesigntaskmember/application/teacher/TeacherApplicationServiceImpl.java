package study.msa.msadesigntaskmember.application.teacher;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntaskmember.application.teacher.response.TeacherRegistrationResponse;

@Service
public class TeacherApplicationServiceImpl implements TeacherApplicationService {

    @Override
    public TeacherRegistrationResponse teacherRegistration(ServerRequest request) {
        return TeacherRegistrationResponse.builder().build();
    }
}
