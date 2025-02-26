package com.example.calculator;

public class Calculator {
    public double calculate(double a1, double a2, char b1) {
        double result = 0;
        if (b1 == '+') {
            result = a1 + a2;
        } else if (b1 == '-') {
            result = a1 - a2;
        } else if (b1 == '*') {
            result = a1 * a2;
        } else if (b1 == '/') {
            if (a2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                return 0;
            }
            result = (double) a1 / a2;
        } else {
            System.out.println("잘못된 연산자입니다.");
            return 0;
        }
    return result;}
}


