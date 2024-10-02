package ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ch03_List {

    public static void main(String[] args) {
        //배열과 리스트의 차이 : 배열은 값의 크기를 정해줘야 하지만 리스트는 크기를 정하지 않아도 된다.

        //필요한 자료형 타입은 import해서 사용
        ArrayList arrayList = new ArrayList();
        //추가를 하기 위해선 add메서드 사용
        arrayList.add("138");
        arrayList.add("129");
        arrayList.add("142");
        System.out.println(arrayList);

        System.out.println(arrayList.get(2));   //142 (해당 인덱스 번호 값을 알고 싶을때)
        System.out.println(arrayList.size());   //3  (인덱스 길이를 알고 싶을때)
        System.out.println(arrayList.contains("142"));  //true  (해당 값이 존재 하는지 boolean)

        System.out.println(arrayList.remove("129"));    //해당값 삭제
        System.out.println(arrayList);          //138, 142
        System.out.println(arrayList.remove(0));    //해당 인덱스 삭제
        
        //제네릭 : 자료형을 안전하게 사용할 수 있도록 미리 타입을 정함
        //<String>작성으로 문자열만 입력가능
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("hello");
        arrayList1.add("World");
        System.out.println(arrayList1);
    
        //<Integer>작성으로 정수만 입력가능
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(111);
        arrayList2.add(222);
        System.out.println(arrayList2);

        //<Double>작성으로 소수만 입력가능
        ArrayList<Double> arrayList3 = new ArrayList<>();
        arrayList3.add(12.58);
        arrayList3.add(10.15);
        System.out.println(arrayList3);

        //배열을 리스트로 변환
        String[] data = {"월", "화", "수"};
        //Arrays의 asList(배열)로 변환
        ArrayList<String> weeks = new ArrayList<>(Arrays.asList(data));
        weeks.add("목");
        weeks.add("금");
        weeks.add("토");
        weeks.add("일");
        System.out.println(weeks);

        //아이템 직접 입력하기
        //배열을 생성하지 않고 하나씩 값을 입력
        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(n);

        //아이템들을 문자열로 String.join 합치기
        //리스트를 문자열로 바꿔준다
        String result = String.join(",", weeks);
        System.out.println(result);
        
        //리스트 정렬하기
        n.sort(Comparator.naturalOrder());  //오름차순(순방향)
        System.out.println(n);
        n.sort(Comparator.reverseOrder());  //내림차순(역방향)
        System.out.println(n);

        weeks.sort(Comparator.naturalOrder());      //한글은 ㄱㄴㄷㄹ 순 (영어는 ABCD순)
        System.out.println(weeks);
    }
}
