package week2;

public class PrefixSum {
    public static void main(String[] args) {
//        Q2. 1차원 배열의 누적합 구하기
//        아래의 정수 배열의 누적합을 구하세요.
//                배열 예시: {2, 5, 8}

        int[] arr = {2, 5, 8};
        int sum = 0;
        for (int i : arr){
            sum+=i;
        }
        System.out.println("누적 합 : "+sum);
    }
}
