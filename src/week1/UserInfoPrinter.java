package week1;

import java.util.Scanner;

public class UserInfoPrinter {
    public static void main(String[] args) {

        // Q1. 이름과 나이 입력받아 출력하는 프로그램 작성
        Scanner scanner = new Scanner(System.in);
        // TODO: 사용자로부터 이름을 입력받기
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        // TODO: 사용자로부터 나이를 입력받기
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        // TODO: 입력받은 값 출력
        System.out.println("출력결과 : ");
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
    }
}
