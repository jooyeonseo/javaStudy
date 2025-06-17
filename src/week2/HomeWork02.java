package week2;

import java.util.*;

public class HomeWork02 {
    public static void main(String[] args) {
//       1. - 입력값
//                - 저장할 자료구조명을 입력합니다. (List / Set / Map)
//                - 내가 좋아하는 요리 제목을 먼저 입력합니다.
//                - 이어서 내가 좋아하는 요리 레시피를 한 문장씩 입력합니다.
//                - 입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.
//        2. - 출력값
//                - 입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력해 줍니다.
//                - 이어서, 입력한 모든 문장 앞에 번호를 붙여서 입력 순서에 맞게 모두 출력해 줍니다.

        Scanner scanner = new Scanner(System.in);

        System.out.print("저장할 자료구조명을 입력합니다. (List / Set / Map) : ");
        String collectionName = scanner.nextLine();

        // 잘못된 값 입력시 종료
        if(!(collectionName.equals("List") || collectionName.equals("Set") || collectionName.equals("Map"))) {
            System.out.println("잘못된 값을 입력하셨습니다.");
            return;
        }

        System.out.print("내가 좋아하는 요리 제목을 먼저 입력합니다. : ");
        String title = scanner.nextLine();



        switch (collectionName) {
            case "List" :
                List<String> list = new ArrayList<>();

                System.out.println("내가 좋아하는 요리 레시피를 한 문장씩 입력합니다. \n (입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.) : ");
                while (true) {
                    String input = scanner.nextLine();
                    if (input.equals("끝")) {
                        break;
                    }
                    list.add(input);
                }

                // 출력하기
                System.out.println("[  " + collectionName + "으로 저장된 " + title + " 만들기  ]");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ". " + list.get(i));
                }
                break;

            case "Set" :
                Set<String> set = new LinkedHashSet<>(); //순서보장

                System.out.println("내가 좋아하는 요리 레시피를 한 문장씩 입력합니다. \n (입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.) : ");
                while (true) {
                    String input = scanner.nextLine();

                    if (input.equals("끝")) {
                        break;
                    }
                    set.add(input);
                }

                // 출력하기
                System.out.println("[  " + collectionName + "으로 저장된 " + title + " 만들기  ]");
                Iterator<String> iterator = set.iterator();

                int num = 1;
                while (iterator.hasNext()) {
                    System.out.println(num + ". " + iterator.next());
                    num++;
                }
                break;

            case "Map" :
                Map<Integer, String> map = new LinkedHashMap<>();
                int idx = 1;

                System.out.println("내가 좋아하는 요리 레시피를 한 문장씩 입력합니다. \n (입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.) : ");
                while (true) {
                    String input = scanner.nextLine();
                    if (input.equals("끝")) {
                        break;
                    }
                    map.put(idx++, input);
                }

                // 출력하기
                System.out.println("[  " + collectionName + "으로 저장된 " + title + " 만들기  ]");

                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    System.out.println(entry.getKey() + ". " + entry.getValue());
                }
                break;

            default : System.out.println("잘못된 입력입니다. ");
        }
    }
}
