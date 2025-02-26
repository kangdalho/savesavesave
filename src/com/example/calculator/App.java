package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        Scanner scanner = new Scanner(System.in);
        while (true) { //계속 반복

            System.out.println("첫 번째 숫자를 입력하세요: ");
            int a1 = scanner.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int a2 = scanner.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            char b1 = scanner.next().charAt(0);

            int sum = 0; // 미리 선언 -> {}내부에서 선언된 변수는 해당 블록을 벗어나면 사용할 수 없음.
            if (b1 == '+') {
                sum = a1 + a2;
            } else if (b1 == '-') {
                sum = a1 - a2;
            } else if (b1 == '*') {
                sum = a1 * a2;
            } else if (b1 == '/') {
                if (a2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    continue; //0 입력시 다시 처음부터 반복
                }
                sum = a1 / a2;
            } else {
                System.out.println("잘못된 연산자입니다.");
                continue; //
            }
            System.out.println("값:" + sum);

            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            String answer = scanner.next();
            if (answer.equals("exit"))
                break; // "exit" 입력시 반복문 종료


        }
    }
}



