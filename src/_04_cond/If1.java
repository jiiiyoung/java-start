package _04_cond;


/*
* If (조건식) {참일 때 실행될 코드}
*
*
* */
public class If1 {
    public static void main(String[] args) {
        int age = 28;
        if (age >= 18) {
            System.out.println("성인입니다.");
        }
        
        if (age < 18) {
            System.out.println("미성년자입니다");
        }
    }
}
