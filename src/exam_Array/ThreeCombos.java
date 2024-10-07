package exam_Array;

public class ThreeCombos {

    public static void main(String[] args) {
        //n을 만드는 3가지 수 출력
        printCombos(10);
    }

    private static void printCombos(int n) {
        int count = 0;
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                for(int k = 0; k <= n; k++) {
                    if(i * j * k ==n){
                        System.out.printf("%d = %d x %d x %d\n",n,i,j,k);
                        count++;
                    }
                }
            }
        }
        System.out.println("------------");
        System.out.println("경우의 수:" + count);
    }
}
