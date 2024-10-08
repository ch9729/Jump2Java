package exam_Class;

class Cube {
    int length;

    public Cube(int length) {
        this.length = length;
    }

    public int volume() {
        return length * length * length;
    }

    public int surfaceArea() {
        return 6 * length * length;
    }
}

public class CubeTest {

    public static void main(String[] args) {
        Cube a = new Cube(3);
        Cube b = new Cube(5);

        System.out.printf("정육면체 a의 부피: %d, 겉넓이: %d\n", a.volume(), a.surfaceArea());
        System.out.printf("정육면체 b의 부피: %d, 겉넓이: %d\n", b.volume(), b.surfaceArea());
    }
}
