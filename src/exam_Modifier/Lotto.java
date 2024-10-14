package exam_Modifier;

import java.util.Random;

class LottoMachine {
    private int[] LottoNumbers;

    public LottoMachine() {
        LottoNumbers = generate();
    }

    public int[] generate() {
        int[] pickedNumbers = new int[6];
        Random random = new Random();

        int num1 = random.nextInt(45) + 1;
        int num2 = random.nextInt(45) + 1;
        int num3 = random.nextInt(45) + 1;
        int num4 = random.nextInt(45) + 1;
        int num5 = random.nextInt(45) + 1;
        int num6 = random.nextInt(45) + 1;

        int[] num = {num1, num2, num3, num4, num5, num6};

        for (int i = 0; i < pickedNumbers.length; i++) {
            pickedNumbers[i] = num[i];
        }
        return pickedNumbers;
    }

    public int[] getLottoNumbers() {
        return LottoNumbers;
    }
}

public class Lotto {

    public static void main(String[] args) {
        LottoMachine machine = new LottoMachine();

        int[] numbers = machine.getLottoNumbers();

        System.out.println("생성 번호");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
