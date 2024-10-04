package ch04;

public class Ch04_While {

    public static void main(String[] args) {
        //반복문 : 조건이 참인동안 계속 수행
        int treeHit = 0;
        while (treeHit < 10){
            treeHit++;
            System.out.println("나무를 " + treeHit + "번 찍습니다.");
            if(treeHit == 10){
                System.out.println("나무가 넘어갑니다.");
            }
        }
        
        //break : 반복문 빠져나오기
        int coffee = 10;
        int money = 30000;
        while(money > 0) {
            money -= 500;
            System.out.println("돈을 받았으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피는 " + coffee + "개 입니다.");
            System.out.println("남은 잔액은 " + money + "입니다.");
            if(coffee == 0){
                System.out.println("커피가 떨어졌습니다. 판매를 중단합니다.");
                break;  //제일 가까이에 있는 반복문을 빠져나온다.
            }
        }

        //continue : 조건문으로 다시 돌아가기
        int a = 0;
        while(a < 10){
            a++;
            if(a % 2 ==0) {
                continue;   //조건문 33행으로 다시 돌아가기
            }
            System.out.println(a);
        }
    }
}
