package _05장_loop;


/*
* 문제: 1부터 시작해서 숫자를 계속 누적해서 더하다가
* 합계가 10보다 처음으로 큰 값은?
* break: 이후의 코드가 실행되지 않고 while문 종료
* continue: 이후의 코드가 실행되지 않고 다시 조건식으로 이동. 조건식이 참이면 while문 실행
* */
public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            if (sum >= 10) {
                System.out.println("합이 10보다 크면 종료: i = " + i + " sum = " + sum);
                break;
            }
            i++;
        }
    }
}
