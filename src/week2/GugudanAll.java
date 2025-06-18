package week2;

public class GugudanAll {
    public static void main(String[] args) {
//        Q2. 2단부터 9단까지 구구단을 출력하는 프로그램(중첩 for 문 활용)
//        2단부터 9단까지 전체 구구단을 출력하는 프로그램을 작성해 보세요.

        for (int i = 2; i <= 9; i++) {
            System.out.println("=== " + i + "단 ===");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
