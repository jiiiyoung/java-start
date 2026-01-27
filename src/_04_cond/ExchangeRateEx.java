package _04_cond;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 100;

        String message;
        if (dollar < 0) {
            message = "잘못된 금액입니다.";
        } else if (dollar == 0){
            message = "환전할 금액이 없습니다.";
        } else {
            message = "환전 금액은 " + dollar * 1300 + "원 입니다.";
        }

        System.out.println(message);

    }
}
