package _04_cond;

public class CondOp1 {
    public static void main(String[] args) {

        // if-else문으로 표현된 조건을 삼항연산자로 구현하기
        int age = 18;
        String status;
        if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age + " status = " + status);
    }
}
