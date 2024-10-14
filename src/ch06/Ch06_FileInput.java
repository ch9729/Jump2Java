package ch06;

import java.io.*;

public class Ch06_FileInput {
    
    //file을 생성할땐 close도 작성
    
    public static void main(String[] args) throws IOException {
        //파일 쓰기
        // FileOutputStream output = new FileOutputStream("c:/exam/out.txt");
        // //c exam 폴더 안에out.txt파일을 만든다.
        // for (int i = 1; i < 11; i++) {
        //     String data = i + "번째 줄입니다. \r\n";  //\r\n 커서를 앞으로 한줄 띄움
        //     output.write(data.getBytes());  //바이트로 쓰기
        // }
        // output.close();

        //FileWriter 문자열을 바로 쓸수 있다, append 값이 true일때 추가로 계속 작성
        // FileWriter fw = new FileWriter("c:/exam/out.txt", true);
        // for (int i = 1; i < 11; i++) {
        //     String data = i + "번째 줄입니다. \r\n";
        //     fw.write(data);
        // }
        // fw.close();

        //PrintWriter는 println 메서드 사용으로 \r\n할 필요가 없다.
        // PrintWriter pw = new PrintWriter(new FileWriter("c:/exam/out1.txt", true));
        // for (int i = 1; i < 11; i++) {
        //     String data = i + "번째 줄입니다.";
        //     pw.println(data);
        // }
        // pw.close();
        
        /* 파일 읽기 : 특정 주소의 파일을 읽어온다 */
        // FileInputStream input = new FileInputStream("c:/exam/out.txt");
        // byte[] buf = new byte[1024];    //1024바이트 배열
        // input.read(buf);
        // String s = new String(buf);
        // System.out.println(s);
        // input.close();
        
        /* 문자열 단위로 읽는 방법 : 파일리더로 문자하나씩 읽고 버퍼리더로 한꺼번에 읽음 */
        BufferedReader br = new BufferedReader(new FileReader("c:/exam/abc.txt"));
        while(true) {
            String line = br.readLine();    //한 줄씩 읽음
            if(line == null) break; //더 이상 읽을 라인이 없을 경우 while문을 빠져나간다.
            System.out.println(line);
        }
        br.close();
    }
}
