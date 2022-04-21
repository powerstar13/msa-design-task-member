package study.msa.msadesigntaskmember.application.certification;

import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntaskmember.application.certification.response.CertificationResponse;

public interface CertificationApplicationService {

    CertificationResponse certification(ServerRequest request); // 권한 확인
}
