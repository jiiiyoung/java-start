package _04_cond;

public class If5 {
    public static void main(String[] args) {
        int discount = 0;
        int itemPrice = 13000;
        int age = 8;
        if (itemPrice >= 10000) {
            discount += 1000;
        }

        if (age <= 10) {
            discount += 1000;
        }

        System.out.println("총 할인 금액: " + discount + "원");
    }
}
