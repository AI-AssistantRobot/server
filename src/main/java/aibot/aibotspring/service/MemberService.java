package aibot.aibotspring.service;

import aibot.aibotspring.dto.MemberDTO;
import aibot.aibotspring.entity.MemberEntity;
import aibot.aibotspring.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
    }

    public MemberDTO login(MemberDTO memberDTO) {
        Optional<MemberEntity> byId = memberRepository.findById(memberDTO.getMemberId());
        if (byId.isPresent()) {
            MemberEntity memberEntity = byId.get();
            if (memberEntity.getPw().equals(memberDTO.getMemberPassword())) {
                MemberDTO dto = MemberDTO.toMemberDTO(memberEntity);
                return dto;
            }
            else {
                return null;
            }
        }
        else {
            return null;
        }
    }
}
