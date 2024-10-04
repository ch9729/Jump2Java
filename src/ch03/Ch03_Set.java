package ch03;

import java.util.Arrays;
import java.util.HashSet;

public class Ch03_Set {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("h", "e", "l", "l", "o"));

        //set : 리스트중에 반복되지 않음, 순서가 없음
        System.out.println(set);        //e, h, l , o

        //교집합 구하기
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        //교집합 출력을 위한 객체 생성
        HashSet<Integer> intersection = new HashSet<>(s1);      //s1으로 교집합생성
        System.out.println(intersection);       //s1과 동일한 값들이 존재 1,2,3,4,5,6
        
        // retainAll : 교집합
        intersection.retainAll(s2);
        System.out.println(intersection);       //4,5,6

        //합집합 구하기
        //합집합 출력을 위한 객체 생성
        HashSet<Integer> union = new HashSet<>(s1);     //s1과 동일한 값 존재
        //addAll : 합집합 (중복되는 것은 삭제)
        union.addAll(s2);
        System.out.println(union);

        //차집합 구하기
        //차집합 출력을 위한 객체 생성
        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2);    //s1과s2의 교집합, s2 값을 제외한 남은 부분만 출력
        System.out.println(substract);      //1,2,3

        //add 메소드
        HashSet<String> s3 = new HashSet<>();
        s3.add("Jump");
        s3.add("To");
        s3.add("Java");
        System.out.println(s3); //Java, To, Jump

        //addAll 메소드
        HashSet<String> s4 = new HashSet<>();
        s4.addAll(s3);
        s4.addAll(Arrays.asList("And", "Home"));
        System.out.println(s4); //Java, And, To, Jump, Home

        //remove 메소드
        s4.remove("Home");
        System.out.println(s4); //Java, And, To, Jump
    }
}
