package ch03;

public class Ch04_Array {

    public static void main(String[] args) {

        int[] odds = {1, 3, 5, 7, 9};   //홀수 배열 생성

        String[] weeks = new String[7];// 문자열 배열 생성
        weeks[0] = "월";
        weeks[1] = "화";
        weeks[2] = "수";
        weeks[3] = "목";
        weeks[4] = "금";
        weeks[5] = "토";
        weeks[6] = "일";

        //배열값에 접근하기 목요일 값은 (0 = 월 ~)
        System.out.println(weeks[3]);
        
        //반복문 사용
        for(int i = 0 ; i < weeks.length; i++) {
            System.out.print(weeks[i]);
            System.out.print(" ");
        }

        for (String week : weeks) {
            System.out.println(week);
        }
    }
}
