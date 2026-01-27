package _02장_variable.ex;

public class VarEx1Question {
    public static void main(String[] args) {
        /*
        ** 문제
        * 다음 코드에서 반복해서 나오는 숫자 4, 3을
        * 다른 숫자로 한번에 변경할 수 있도록
        * num1, num2를 사용하도록 변경해보세요.
        * */
        System.out.println(4 + 3);
        System.out.println(4 - 3);
        System.out.println(4 * 3);

        // 정답
        int num1 = 4;
        int num2 = 3;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);

    }
}
