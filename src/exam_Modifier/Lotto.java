// package eaxm_Modifier;
//
// import java.util.Random;
//
// class LottoMachine {
//     private int[] LottoNumbers;
//
//     public LottoMachine(int[] lottoNumbers) {
//         LottoNumbers = lottoNumbers;
//     }
//
//     public int[] generate() {
//         int[] pickedNumbers = new int[6];
//         Random random = new Random();
//
//         for(int i = 0; i < 6; i++) {
//             pickedNumbers[i] = random.nextInt(44)+1;
//         }
//         return pickedNumbers;
//     }
//
//     public int[] getLottoNumbers() {
//         return LottoNumbers;
//     }
//
// }
//
// public class Lotto {
//
//     public static void main(String[] args) {
//         LottoMachine machine = new LottoMachine();
//
//         int[] numbers = machine.getLottoNumbers();
//
//         for (int number : numbers) {
//             System.out.println(number);
//
//         }
//     }
// }
