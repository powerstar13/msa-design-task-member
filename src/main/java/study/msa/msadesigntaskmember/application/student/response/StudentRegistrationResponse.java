package study.msa.msadesigntaskmember.application.student.response;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StudentRegistrationResponse {

    private long studentId; // 학생 고유번호
}
