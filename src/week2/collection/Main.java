package week2.collection;

public class Main {
    public static void main(String[] args) {
//        Q1. ArrayList 로 장바구니를 구현해 보세요.
//        요구사항 (Product, Cart 클래스 구현)
//        장바구니 상품: 양파, 사과, 생선, 두부
//        기능1: 상품추가(addProduct)
//        기능2: 장바구니 목록 출력(printCart)
//        기능3: 상품 삭제(removeProduct)
//        기능4: 총 가격 계산(calculateTotalPrice )

        Prodcut onion = new Prodcut("양파",1000);
        Prodcut apple = new Prodcut("사과",3000);
        Prodcut fish = new Prodcut("생선",2500);
        Prodcut tofu = new Prodcut("두부",1500);

        Cart cart = new Cart();

        // 상품 추가
        cart.addProdcut(onion);
        cart.addProdcut(apple);
        cart.addProdcut(fish);
        cart.addProdcut(tofu);

        // 상품 목록 출력
        cart.printCart();

        // 상품 삭제 (apple)
        cart.removeProduct("포도");
        cart.printCart();

        // 총 가격 계산
        cart.calculateTotalPrice();




    }
}
