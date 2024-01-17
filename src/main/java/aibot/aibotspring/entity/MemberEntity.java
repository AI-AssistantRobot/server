package aibot.aibotspring.entity;

import aibot.aibotspring.dto.MemberDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "userTBL")
public class MemberEntity {
    @Id
    @Column(unique = true)
    private String id;
    @Column
    private String pw;
    @Column
    private String name;
    @Column
    private String phone_number;
    @Column
    private String email;
    @Column
    private String libraryTBL_library_name;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(memberDTO.getMemberId());
        memberEntity.setPw(memberDTO.getMemberPassword());
        memberEntity.setName(memberDTO.getMemberName());
        memberEntity.setPhone_number(memberDTO.getMemberPhone());
        memberEntity.setEmail(memberDTO.getMemberEmail());
        memberEntity.setLibraryTBL_library_name(memberDTO.getMemberLibrary());

        return memberEntity;
    }

}
