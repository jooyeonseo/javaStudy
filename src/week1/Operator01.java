package week1;

public class Operator01 {
    public static void main(String[] args) {

//        Q1. 산술 연산자 문제
//        두 개의 정수 a 와 b 가  주어졌을 때 두 수의 합, 차, 곱, 나누기
//        그리고 나머지(%모듈러) 연산 결과를 변수에 저장한 후 출력하는 프로그램을 작성하세요.

        int a = 15;
        int b = 4;

        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("덧셈 결과 : " + sum);
        System.out.println("뺄셈 결과 : " + diff);
        System.out.println("곱셈 결과 : " + product);
        System.out.println("나눗셈 결과 : " + div);
        System.out.println("나머지 결과 : " + mod);
    }
}
