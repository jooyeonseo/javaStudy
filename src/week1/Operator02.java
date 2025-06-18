package week1;

public class Operator02 {
    public static void main(String[] args) {
//        Q2. 비교 연산자 문제
//        두 개의 정수 x와 y가 주어졌을 때
//        x가 y보다 큰지 (>)
//        x가 y보다 작은지 (<)
//        x와 y가 같은지 (==)
//        x와 y가 다르면 (!=)각각의 결과를 변수에 저장하고 출력하는 프로그램을 작성하세요.

        int x = 10;
        int y = 20;

        boolean isGreater = x > y;
        boolean isSmaller = x < y;
        boolean isEqual = x == y;
        boolean isNotEqual = x != y;

        System.out.println("x가 y보다 큰가? " + isGreater);
        System.out.println("x가 y보다 작은가? " + isSmaller);
        System.out.println("x와 y가 같은가? " + isEqual);
        System.out.println("x와 y가 다른가? " + isNotEqual);
    }
}
