package com.example.demo.write;

import com.example.demo.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WriteServiceImplTest {

    @Autowired
    WriteRepository writeRepository;

    @Autowired
    WriteService writeService;

    @Autowired
    MemberService memberService;

    @Test
    void create() {

    }

    @Test
    void findAllWrite() {
    }

    @Test
    void findOneWrite() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}