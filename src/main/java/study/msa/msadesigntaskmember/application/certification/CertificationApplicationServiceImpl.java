package study.msa.msadesigntaskmember.application.certification;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntaskmember.application.certification.response.CertificationResponse;

@Service
public class CertificationApplicationServiceImpl implements CertificationApplicationService {

    @Override
    public CertificationResponse certification(ServerRequest request) {
        return CertificationResponse.builder().build();
    }
}
