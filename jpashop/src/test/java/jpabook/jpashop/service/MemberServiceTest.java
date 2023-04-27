package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 회원가입(){
        //given
        Member member = new Member();
        member.setName("Gwon");

        //when
        Long saveId = memberService.join(member);

        //then
        assertEquals(member,memberRepository.findOne(saveId));

    }

    @Test()
    public void 중복_회원_예외(){
        //given
        Member member = new Member();
        member.setName("gwon");
        Member member1 = new Member();
        member1.setName("gwon");
        //when
        memberService.join(member);
        assertThrows(IllegalStateException.class,()->{
            memberService.join(member1);
        });
        //then
    }
}