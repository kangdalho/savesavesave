package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while (true){ //계속반복
            System.out.println("첫 번째 숫자를 입력하세요: ");
            double a1 = scanner.nextDouble();

            System.out.println("두 번째 숫자를 입력하세요: ");
            double a2 = scanner.nextDouble();

            System.out.println("사칙연산 기호를 입력하세요: ");
            char b1 = scanner.next().charAt(0);

            double result = calculator.calculate(a1, a2, b1);
            System.out.println("값 = " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            String answer = scanner.next();
            if (answer.equals("exit"))
                break; // "exit" 입력시 반복문 종료


        }
    }
}



