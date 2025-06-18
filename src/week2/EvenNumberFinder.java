package week2;

public class EvenNumberFinder {
    public static void main(String[] args) {
//        Q1. 1차원 배열에서 짝수만 출력하기
//        아래의 정수 배열이 주어졌을 때 짝수만 출력하세요.
//         배열 예시: {3, 4, 7, 10, 15, 20}

        int[] arr = {3, 4, 7, 10, 15, 20};

        System.out.print("짝수 : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]);
                if (i!=arr.length-1){
                    System.out.print(", ");
                }
            }
        }

    }
}
