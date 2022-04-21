package study.msa.msadesigntaskmember.domain.model.member;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    private Long memberId; // 회원 고유번호

    private String memberLoginId; // 로그인 아이디
    private String memberPassword; // 비밀번호

    private Long memberTargetId; // 연결된 고유번호
    private MemberTargetType memberTargetType; // 연결된 유형
}
