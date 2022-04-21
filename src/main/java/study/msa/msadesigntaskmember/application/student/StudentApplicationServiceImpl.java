package study.msa.msadesigntaskmember.application.student;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntaskmember.application.student.response.StudentRegistrationResponse;

@Service
public class StudentApplicationServiceImpl implements StudentApplicationService {

    @Override
    public StudentRegistrationResponse studentRegistration(ServerRequest request) {
        return StudentRegistrationResponse.builder().build();
    }
}
