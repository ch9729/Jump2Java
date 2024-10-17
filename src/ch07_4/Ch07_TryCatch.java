package ch07_4;

import java.io.*;

public class Ch07_TryCatch {

    public static void main(String[] args) throws IOException {
        //파일 찾기 예외처리
        BufferedReader br = new BufferedReader(new FileReader("없는파일.txt"));
        //파일 읽을수 없을경우 예외처리
        br.readLine();
        br.close();

        //산술의 문제
        try {
            int c = 4/0;    //예외 발생할 부분은 try에 작성
        } catch (ArithmeticException e) {
            System.out.println("수학예외 0으로 나누는 에러 발생");
        } finally {
            System.out.println("에러발생 하든 안하든 실행");
        }



        //배열의 인덱스 번호
        try {
            int[] a = {1, 2, 3};
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위를 넘기는 예외!" + e.getMessage());
        }

        System.out.println("프로그램 종료");

    }
}
