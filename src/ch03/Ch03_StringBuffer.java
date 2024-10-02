package ch03;

public class Ch03_StringBuffer {

    public static void main(String[] args) {
        
        //문자열을 추가하거나 변경할때 사용하는 자료형
        StringBuffer sb = new StringBuffer();   //StringBuffer 객체 생성

        sb.append("Hello"); //buffer 객체는 append 메소드르 사용해서 문자열을 추가
        sb.append(" World");
        System.out.println(sb); //Hello World

        String s = "헬로우";
        s = "추가";
        System.out.println(s);  //String 문자열을 변경이 가능하지만 추가가 되지는 않음

        //sb 대신 문자열로 해보자
        String result = "";     //객체 생성을 하지 않을시 참조값이 없으므로 하나씩 메모리에 공간을 차지 String은 불변객체
        result += "헬로우";
        result += " ";
        result += "점프 투 자바";
        System.out.println(result); //헬로우 점프 투 자바 
        //하나씩 추가 시키는 번거러움을 없애기 위해 StringBuffer append 메서드 사용

        //StringBuffer 객체 생성
        StringBuffer sb2 = new StringBuffer();
        sb2.append("jump to java");
        sb2.insert(0, "hello ");    //0번째 자리에 hello  문자열을 추가
        System.out.println(sb2);        //hello jump to java

        //substring : 문자열 잘라내기
        StringBuffer sb3 = new StringBuffer();
        sb3.append("hello jump to java");   
        System.out.println(sb3.substring(0,4));     //hell (0번째 인덱스부터 4인덱스 전까지 잘라내기)
    }
}
