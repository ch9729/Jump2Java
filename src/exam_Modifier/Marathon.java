package exam_Modifier;

import java.util.HashMap;

public class Marathon {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"병주", "병헌", "승언"}, new String[]{"병헌", "승언"}));
        System.out.println(solution(new String[]{"병주", "병헌", "승언", "송군"}, new String[]{"병주", "병헌", "송군"}));
        System.out.println(solution(new String[]{"병주", "병헌", "승언", "병헌"}, new String[]{"병주", "병헌", "승언"}));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> hm = new HashMap<String, Integer>();

        for (String name : participant) {
            if(hm.get(name) == null){   //key에 이름이 없다면 이름과 함께 1추가
                hm.put(name,1);
            }else { //이름이 있으면 해쉬맵 이름에 해당하는 값을 가져와 1 추가
                int value = hm.get(name) + 1;
                hm.put(name,value);
            }
        }

        //마라톤 완주자 이름은 해쉬맵에서 -1
        for (String name : completion) {
            int value = hm.get(name) -1 ;
            hm.put(name,value);
        }

        //
        for(String name : hm.keySet()){
            if(hm.get(name) == 1)answer = name;
        }
        
        return answer;
    }
}
