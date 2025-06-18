package week2;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {

//        Q1. 신호등 색상을 입력하면 프로그램이 올바른 안내 메시지를 출력하도록 만드세요!

//         “초록불” → “건너세요!” 출력
//         “노란불” → “주의하세요!” 출력
//         “빨간불” → “멈추세요!” 출력
//         그 외의 값이 입력되면 → “잘못된 입력입니다!” 출력

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("신호등 색상을 입력하세요. (초록불, 노란불, 빨간불) : ");
            String input = scanner.nextLine();

            if (input.equals("초록불")) {
                System.out.println("건너세요!");

            } else if (input.equals("노란불")) {
                System.out.println("주의하세요!");

            } else if (input.equals("빨간불")) {
                System.out.println("멈추세요!");

            } else {
                System.out.println("잘못된 입력입니다!");
            }
        }
    }
}
