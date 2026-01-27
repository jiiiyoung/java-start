package _04_cond;

import java.util.Scanner;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 12;

        String type;
        if (distance <= 1) {
            type = "도보";
        } else if (distance <= 10) {
            type = "자전거";
        } else if (distance <= 100) {
            type = "자동차";
        }else {
            type = "비행기";
        }

        System.out.println(type + "를 이용하세요.");
    }
}
