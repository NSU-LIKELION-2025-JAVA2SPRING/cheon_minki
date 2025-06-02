package nsu;

import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

        Scanner scan = new Scanner(System.in);
        System.out.print("입력하세요: ");
        scan.nextInt();

        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산

        if(secDiffTime <= 30) {
            System.out.println("30초가 지나지 않았습니다.");
        } else {
            System.out.println("작성할 수 있습니다.");
        }

        System.out.println("시간차이(m) : "+secDiffTime);
        scan.close();
    }
}
