package study.msa.msadesigntaskmember.application.login;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntaskmember.application.login.response.LoginResponse;

@Service
public class LoginApplicationServiceImpl implements LoginApplicationService {

    @Override
    public LoginResponse login(ServerRequest request) {
        return LoginResponse.builder().build();
    }
}
