package ch03;

public class Ch03_String {

    public static void main(String[] args) {
        //숫자 (int, double), 문자 (char), 불린(boolean) => 기초자료형
        //문자열은 기초자료형이 아니다.
        String a = "Happy Java";
        String b = "a";
        String c = "123";
        //문자열은 리터럴 표기방식을 사용하는것이 좋다.

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //문자열의 내장 메서드
        a = "hello";
        b = "java";
        c = "hello";
        //문자열 비교 메서드 equals
        System.out.println(a.equals(c));        //true
        System.out.println(a.equals(b));        //false
        
        //indexOf : 특정 문자열이 시작되는 위치 (인덱스 값)
        a = "Hello Java";
        System.out.println(a.indexOf("Java"));      //6

        //contains : 특정 문자열이 포함되어 있는지 여부를 리턴
        System.out.println(a.contains("Java"));     //true

        //charAt : 문자열에서 특정 위치의 문자를 리턴
        System.out.println(a.charAt(6));            //J

        //replaceAll : 특정 문자열을 다른 문자열로 바꿀때
        System.out.println(a.replaceAll("Java", "World"));   //Hello World

        //substring : 문자열에서 특정 문자열을 뽑아낼 때 사용
        System.out.println(a.substring(0,4));       //Hell

        //toUpperCase : 대문자로 표시
        System.out.println(a.toUpperCase());        //HELLO JAVA

        //split : 문자열을 특정한 구분자로 나누어 문자열 배열로 리턴
        a = "a:b:c:d";
        String[] result = a.split(":"); // a b c d
        for(int i = 0 ; i < result.length ; i++){
            System.out.println(result[i]);
        }
        
        //문자열 포매팅(문자열 안에 특정 타입값을 입력)
        System.out.println(String.format("나는 사과를 %s 먹었다.","5개"));
        //%s 문자열, %d 정수

        System.out.println(String.format("나는 사과를 %d개 먹었다.",10));

        //두개 이상 입력
        System.out.println(String.format("나는 사과를 %d개 먹고 아파서 %s일 약을 먹었다.",5,"이"));
    }
}
