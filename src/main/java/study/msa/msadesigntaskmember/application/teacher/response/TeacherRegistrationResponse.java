package study.msa.msadesigntaskmember.application.teacher.response;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TeacherRegistrationResponse {

    private long teacherId; // 강사 고유번호
}
