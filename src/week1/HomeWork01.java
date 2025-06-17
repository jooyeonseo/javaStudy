package week1;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
//        요리 레시피 메모장 만들기
//        1. - 입력값
//                - 내가 좋아하는 요리 제목을 먼저 입력합니다.
//                - 요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해 주세요. (ex. 3.5)
//                - 이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장을 입력합니다.
//
//        2. - 출력값
//                - 입력이 종료되면 요리 제목을 괄호로 감싸서 먼저 출력해 줍니다.
//                - 이어서, 요리 별점을 소수점을 제외한 정수로만 출력해 줍니다. (ex. 3)
//                - 바로 뒤에 정수 별점을 5점 만점 퍼센트로 표현했을 때 값을 실수로 출력해 줍니다. (ex. 60.0%)
//                - 이어서, 입력한 모든 문장 앞에 번호를 붙여서 모두 출력해 줍니다

        Scanner scanner = new Scanner(System.in);
        // 요리 제목 입력
        System.out.print("내가 좋아하는 요리 제목을 먼저 입력합니다. : ");
        String title = scanner.nextLine();
        // 요리 별점 입력
        System.out.print("요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해 주세요. (ex. 3.5) : ");
        double rate = scanner.nextDouble();
        scanner.nextLine();

        String[] recipe = new String[10];
        System.out.println("내가 좋아하는 요리 레시피를 한 문장씩 10문장을 입력합니다.");
        for (int i = 0; i < recipe.length; i++) {
            recipe[i] = scanner.nextLine();
        }

        // 요리 제목 출력
        System.out.println("[   "+title+"   ]");
        // 별점 출력
        int rateToInt = (int)rate;
        double percent = ((int)rate / 5.0 ) * 100;
        System.out.println("별점 : "+rateToInt+" ("+percent+"%)");
        // 입력 값 출력
        for (int i = 0; i < recipe.length; i++) {
            System.out.println((i+1)+". "+recipe[i]);
        }


    }
}
