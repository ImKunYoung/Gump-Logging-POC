package com.example.slf4jpoc.service;

import com.example.slf4jpoc.controller.dto.MemberRequest;
import com.example.slf4jpoc.domain.Member;
import com.example.slf4jpoc.domain.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void save(MemberRequest memberRequest) {
        Member member = memberRequest.toEntity();
        memberRepository.save(member);
    }
}