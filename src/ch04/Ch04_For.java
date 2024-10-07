package ch04;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch04_For {

    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};

        //초기값; 조건문; 증가값
        for (int i = 0; i < numbers.length; i++ ){
            System.out.println(numbers[i]);
        }
        
        //예제 : 5명이 시험을 봤는데 점수가 60점 넘으면 합격 아니면 불합격
        int[] marks = {90, 25, 67, 48, 80};

        for (int i = 0; i < marks.length; i++){
            if(marks[i] >= 60){
                System.out.println(i+1 + "번 학생은 합격입니다.");
            }else {
                System.out.println(i+1 + "번 학생은 불합격입니다.");
            }
        }

        System.out.println("-------------------------");

        //합격학생만 출력하기
        for(int i = 0; i < marks.length; i++){

            if(marks[i] <60) {
                continue;
            }
            System.out.println(i+1 +"번 학생은 합격입니다.");
        }
        
        //2중for문 : for문 안에 for문 작성
        //구구단 출력(2단~9단)
        for(int i = 2; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.println(i + "x" + j + "=" + (i*j));
            }
            System.out.println();
        }

        //for-each문
        ArrayList<String> number = new ArrayList<>(Arrays.asList("one","two","three"));
        for (String n : number) {
            System.out.println(n);
        }
    }
}
