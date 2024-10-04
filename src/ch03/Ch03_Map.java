package ch03;

import java.util.HashMap;

public class Ch03_Map {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(); //key값과 value값을 입력할 제네릭 타입이 필요한다.
        
        //맵은 추가를 put으로 한다.
        map.put("people", "사람");    //people를 검색하면 사람이 나온다.
        map.put("baseball", "야구");    //baseball를 검색하면 야구가 나온다.
        
        //자료를 가져올때는 get("key값 입력")을 사용
        System.out.println(map.get("people"));      //사람
        
        //containsKey : 맵에 해당 key가 있는지 참 거짓으로 리턴
        System.out.println(map.containsKey("people"));      //true

        //remove : 맵 해당 key값 입력으로 삭제
        System.out.println(map.remove("people"));       //삭제는 되지만 return은 value가 나온다.
        System.out.println(map.get("people"));              //romove로 삭제된 people는 null로 표현

        //size :map안에 들어있는 개수가 몇개인지
        System.out.println(map.size());         //1

        //keyset : key에 어떤것들이 있는지 리턴
        //values : value에 어떤것들이 있는지 리턴
        map.put("apple", "사과");                 //apple 추가
        System.out.println(map.keySet());       //baseball, apple
        System.out.println(map.values());       //사과, 야구
        System.out.println(map.entrySet());
    }
}
