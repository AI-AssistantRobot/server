package aibot.aibotspring.dto;


import aibot.aibotspring.entity.MemberEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDTO { // 회원 정보 필드로 정의
    private String memberId;
    private String memberPassword;
    private String memberName;
    private String memberPhone;
    private String memberEmail;
    private String memberLibrary;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberId(memberEntity.getId());
        memberDTO.setMemberPassword(memberEntity.getPw());
        memberDTO.setMemberName(memberEntity.getName());
        memberDTO.setMemberPhone(memberEntity.getPhone_number());
        memberDTO.setMemberEmail(memberEntity.getEmail());
        memberDTO.setMemberLibrary(memberEntity.getLibraryTBL_library_name());

        return memberDTO;
    }
}
