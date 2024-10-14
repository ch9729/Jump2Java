package ch06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch06_ConsoleInput {

    public static void main(String[] args) throws IOException {
        InputStream in = System.in; //콘솔 키보드 입력받기

        // int a;
        // a = in.read();
        // char b = (char) a;
        // System.out.println("입력된 값은: " + a);
        // System.out.println("문자는 : " + b);

        // int a, b, c;
        // a = in.read();
        // b = in.read();
        // c = in.read();
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        
        // byte[] a = new byte[3];
        // in.read(a); //입력 byte배열의 개수만큼 읽어서 배열에 입력함
        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);
        // for(int i = 0 ; i < a.length; i++){
        //     System.out.println(a[i]);
        // }

        /*inputStreamReader 입력 문자를 그대로 받음*/
        InputStreamReader reader = new InputStreamReader(in);
        // char[] a = new char[3];
        // reader.read(a);
        // System.out.println(a);

        /* BufferedRead : 문자열 읽기*/
        BufferedReader br = new BufferedReader(reader);
        // String line = br.readLine();
        // System.out.println(line);

        /* Scanner 다양한 값을 읽을수 있음 */
        Scanner sc = new Scanner(System.in);
        //System.out.println(sc.next());
        int x = sc.nextInt();
        System.out.println(x);
        double z = sc.nextDouble();
        System.out.println(z);
        sc.nextLine();  //숫자 다음 문자를 읽어오기 위해
        String y = sc.nextLine();   //enter 키값 이전까지 문자열로 끊어서
        System.out.println(y);
        sc.close(); //더 이상 사용하지 않을때 스캐너를 종료함(없어도 무관)

    }
}
