package week2.collection;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    // ArrayList 사용
    //      기능1: 상품추가(addProduct)
    //     기능2: 장바구니 목록 출력(printCart)
    //     기능3: 상품 삭제(removeProduct)
    //     기능4: 총 가격 계산(calculateTotalPrice )

    private List<Prodcut> cartList = new ArrayList<Prodcut>();

    // 상품 추가
    public void addProdcut(Prodcut prodcut) {
        cartList.add(prodcut);
        System.out.println(prodcut.getName()+" 추가되었습니다.");
    }

    // 목록 출력
    public void printCart() {

        if (cartList.isEmpty()) {
            System.out.println("장바구니에 상품이 없습니다.");
        }else{
            for (Prodcut prodcut : cartList) {
                System.out.println(prodcut.getName()+" : "+prodcut.getPrice());
            }
        }


    }

    // 상품 삭제
    public void removeProduct(String productName) {
        boolean found = false;
        for (Prodcut prodcut : cartList) {
            if (productName.equals(prodcut.getName())) {
                cartList.remove(prodcut);
                found = true;
                System.out.println("삭제되었습니다.");
                break;
            }

        }

        if(!found) {
            System.out.println(productName+" 장바구니에 없는 상품입니다.");
        }
    }

    // 총 가격 계산
    public void calculateTotalPrice(){
        int totalPrice = 0;
        for (Prodcut prodcut : cartList) {
            totalPrice += prodcut.getPrice();
        }
        System.out.println("총 가격 : "+totalPrice);
    }
}
