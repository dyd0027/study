package jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    @Transactional
    public void testMember() throws Exception{
        Member member = new Member();
        member.setUsername("memberA");

        Long saveId = memberRepository.save(member);
        Member member1 = memberRepository.find(saveId);

        Assertions.assertThat(member1.getId()).isEqualTo(member.getId());
        Assertions.assertThat(member1.getUsername()).isEqualTo(member.getUsername());

    }
}