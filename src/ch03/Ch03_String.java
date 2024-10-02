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
            System.out.print(result[i]);
            System.out.print(" ");
        }
        System.out.println();

        //문자열 포매팅(문자열 안에 특정 타입값을 입력)
        System.out.println(String.format("나는 사과를 %s 먹었다.","5개"));
        //%s 문자열, %d 정수

        System.out.println(String.format("나는 사과를 %d개 먹었다.",10));

        //두개 이상 입력
        System.out.println(String.format("나는 사과를 %d개 먹고 아파서 %s일 약을 먹었다.",5,"이"));

        //문자열 포맷 코드 (%s=문자열 %c=문자 %d=숫자 %f=소수)

        //문자열 포맷 정렬과 공백
        System.out.println(String.format("%10s", "h1"));    //          h1 (공백8칸뒤에 h1 표시)

        // - 공백
        System.out.println(String.format("%-10s", "h1"));   //h1        (h1뒤에 공백8칸)

        //소수점
        System.out.println(String.format("%.4f",2.354888));     //2.3549 (소수점 4자리까지 표현 '반올림')
        System.out.println(String.format("%10.4f",2.354888));     //    2.3549 (.까지 포함해서 총 10자리까지 표현)
        
        //print : 출력 메소드, println : 한줄을 출력함
        //printf : 문자열 포맷을 포함하는 출력 메소드
        System.out.print("출력");     //붙여서 연달아
        System.out.print("출력");
        System.out.println("출력");   //한칸 띄우기
        System.out.println("출력");

        //String.format 메소드를 포함
        System.out.printf("나는 아침에 사과 %d개를 먹었다",5);

    }
}
