package ch03;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch03_Casting_Final {

    public static void main(String[] args) {
        String num = "123"; //문자열 123
        int n = Integer.parseInt(num);  //문자열 123을 숫자 123으로 표현
        System.out.println(n);

        String num2 = "3.123";      //문자열 3.123
        double n2 = Double.parseDouble(num2);   //소수 3.123으로 변경
        System.out.println(n2);

        //정수를 문자열로 변환
        int n3 = 456;
        String num3 = String.valueOf(n3);   //문자열로 변환
        //String num3 = "" + n3 //위와 동일 (문자열 + 숫자 = 문자열)
        System.out.println(num3);
        
        String num4 = Integer.toString(n3);     //16행과 동일하게 문자열로 변환
        System.out.println(num4);

        //실수를 문자열로 변환
        String num5 = Double.toString(n2);      //n2 = 실수 3.123
        // String num5 = String.valueOf(n2);  //위와 동일
        System.out.println(num5);

        //정수 -> 실수
        int n4 = 123;
        double d2 = n4;
        System.out.println(d2);

        //실수 -> 정수
        double d3 = 123.456;
        int n5 = (int) d3;      //강제형변환 (다운캐스팅)
        System.out.println(n5);
        
        //형변환시 주의점
        String num7 = "123.456";
        //int n6 = Integer.parseInt(num7);    //문자열이 소수로 나와있지만 변환은 int 타입으로 변환하려고 하기 때문에 컴파일 오류 발생
        //해결법
        //int n6 = (int) Double.parseDouble(num7);

        //Final : 상수(최초 한번 값을 설정 이후 고정값으로 값 변경 불가)
        final int m = 1;
        //m = 2;  변경이 불가

        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        //a = new ArrayList<>(Arrays.asList("c","d"));    //재할당 불가
        System.out.println(a);
    }
}
