package study.msa.msadesigntaskmember.application.login;

import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntaskmember.application.login.response.LoginResponse;

public interface LoginApplicationService {

    LoginResponse login(ServerRequest request); // 로그인
}
