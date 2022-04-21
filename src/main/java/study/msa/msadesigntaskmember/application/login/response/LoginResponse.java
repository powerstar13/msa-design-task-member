package study.msa.msadesigntaskmember.application.login.response;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {

    private String authorization; // 권한 인증
}
