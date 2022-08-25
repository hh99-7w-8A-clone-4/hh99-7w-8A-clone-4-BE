package be.clone.kakao.repository;

import be.clone.kakao.domain.member.Member;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByEmail(String email);

    Optional<Member> findByKakaoId(Long kakaoId);
    Boolean existsByEmail(String email);
}
