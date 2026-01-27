package _04_cond;

public class If4 {
    public static void main(String[] args) {
        int age = 20;

        String status;
        if (age <= 7) {
            status = "미취학";
        } else if (age <= 13) {
            status = "초등학생";
        } else if (age <= 16) {
            status = "중학생";
        } else if (age <= 19) {
            status = "고등학생";
        } else {
            status = "성인";
        }

        System.out.println(status);
    }
}
