package com.example.slf4jpoc.controller;

import com.example.slf4jpoc.controller.dto.MemberRequest;
import com.example.slf4jpoc.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody MemberRequest request) {
        memberService.save(request);
    }
}