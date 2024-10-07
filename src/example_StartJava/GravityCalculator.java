package example_StartJava;

public class GravityCalculator {

    public static void main(String[] args) {
        
        double time = 5.0;      //이동 시간
        double gravity = -9.81; //중력 가속도
        double initialVelocity = 0.0;   //초기 속도
        double initialPosition = 1000.0;    //초기 위치
    
        //제곱 공식
        double result = Math.pow(time,2);

        double finalPosition = (gravity*result)/2+(initialVelocity*time)+initialPosition;

        System.out.printf("%.2f초 후 위치: %.2fm\n",time,finalPosition);
    }
}
