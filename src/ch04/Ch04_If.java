package ch04;

import java.util.ArrayList;

public class Ch04_If {

    public static void main(String[] args) {
        /*여러줄 주석
        Ctrl + Shift + /
        */
        int money = 2000;
        boolean hasCard = true;

        if(money > 3000) {
            System.out.println("택시를 타고 간다.");
        }else {
            System.out.println("걸어가라.");
        }

        if(money > 3000 || hasCard) {       //둘중 하나라도 참이면 true
            System.out.println("택시를 타고 간다.");
        }else {
            System.out.println("걸어가라");
        }

        if(money > 3000 && hasCard) {       //둘다 참이면 true
            System.out.println("택시를 타고 간다.");
        }else {
            System.out.println("걸어가라");
        }

        //contains : 배열에 값 해당 여부
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("cellPhone");
        pocket.add("money");
        
        if(pocket.contains("money")) {      //해당 리스트에 값이 있으면 참이여라
            System.out.println("택시를 타고 간다.");
        }else {
            System.out.println("걸어간다");
        }

        //else-if : 처음 if에서 거짓일때 else if가 참인지 확인
        if(money > 3000) {
            System.out.println("택시를 타고 간다.");
        }else if(money > 1500) {
            System.out.println("지하철을 타고 간다.");
        }else {
            System.out.println("걸어간다.");
        }
    }
}
