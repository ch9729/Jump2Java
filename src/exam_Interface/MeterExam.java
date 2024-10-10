package exam_Interface;

interface Meter {
    public void start();
    public void stop(int meter);
}

class Taxi implements Meter {
    public int BASE_FARE = 3000;
    @Override
    public void start() {
        System.out.println("운행을 시작합니다.");
    }

    @Override
    public void stop(int meter) {
        System.out.println("운행을 종료합니다. 요금은 " + (BASE_FARE+(meter*2)) + "원 입니다.");
    }
}

public class MeterExam {

    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        taxi.start();
        taxi.stop(2500);
    }
}
