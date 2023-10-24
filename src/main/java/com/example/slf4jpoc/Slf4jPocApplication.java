package com.example.slf4jpoc;


public class Slf4jPocApplication {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("로깅 재밌어!");
            System.err.println("이건 에러야!");
        }
    }

}
