package _05장_loop;

/*
* do-while문
* do-while문은 while문가 비슷하지만 조건에 상관없이 무조건 한번은 코드를 실행
* do { 코드 } while (조건식);
* */ 
public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i < 3);
    }
}
