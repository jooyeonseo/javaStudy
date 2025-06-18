package week1;

import java.util.Scanner;

public class Operator03 {
    public static void main(String[] args) {
//        Q3. 두 문자열이 같은지 비교할 수 있는 프로그램을 만들어 봅시다.
//            입력한 두 개의 문자열 str1과 str2  을 비교한 결과를 result 에 담아서 출력하세요.
//            (두 문자열이 같은지  비교할 때 활용 (.equals()))

        Scanner scanner = new Scanner(System.in);
        // TODO: 사용자로부터 첫 번째 문자열 입력받기
        System.out.print("첫 번째 문자열을 입력하세요 : ");
        String firstInput = scanner.nextLine();
        // TODO: 사용자로부터 두 번째 문자열 입력받기
        System.out.print("두 번째 문자열을 입력하세요 : ");
        String secondInput = scanner.nextLine();
        // TODO: 문자열 비교 결과를 변수 result 에 저장
        boolean result = firstInput.equals(secondInput);
        // TODO: 결과 출력
        System.out.print("두 문자열이 같은가요? : "+result);
    }
}
