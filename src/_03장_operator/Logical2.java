package _03장_operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        // a는 10보다 크고 20보다 작다
        boolean result = a > 10 && a < 20; // (a > 10) && (a < 20)
        System.out.println("result = " + result);
        // 실행결과
        // result = true

        // 참고로 변수의 위치를 변경하면 더 읽기 좋다
        // boolean result = 10 < a && a < 20;

    }
}
