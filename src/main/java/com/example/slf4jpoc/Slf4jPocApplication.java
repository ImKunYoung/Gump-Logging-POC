package com.example.slf4jpoc;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jPocApplication {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("로깅 재밌어!");
            System.err.println("이건 에러야!");
        }

        Logger logger = LoggerFactory.getLogger(Slf4jPocApplication.class);

        for (int i  = 0; i < 3; i++) {
            logger.debug("이건 디버깅임! {}", i);
            logger.error("이건 에러임! {}", i);
            logger.info("이건 인포임! {}", i);
            logger.warn("이건 경고임! {}", i);
            logger.trace("이건 트레이스임! {}", i);
        }
    }

}
