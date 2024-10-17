package ch07_4;

// 커스텀(만든) 예외 FoolException
class FoolException extends RuntimeException {

}
// 일반 예외를 상속한 FoolException2
class FoolException2 extends Exception {

}

class Sample {
    public void sayNick(String nick) {
        try {
            if("바보".equals(nick)) {
                throw new FoolException();
            }
            System.out.println(nick + "입니다.");  //문제가 없을경우에는 출력
        } catch (FoolException e) {
            System.err.println("FoolException 발생했습니다.");
        }

    }
}

class Sample2 {
    public void sayNick(String nick) throws FoolException2 {

        if("바보".equals(nick)) {
                throw new FoolException2();
        }System.out.println(nick + "입니다.");  //문제가 없을경우에는 출력
    }
}

public class Ch07_RunTimeException {

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.sayNick("바보");
        sample.sayNick("천재");
    }
}
