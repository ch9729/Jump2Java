package ch07;

import ch07.house.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Ch07_Package {

    public static void main(final String[] args) {
        String str = "미리 임포트 된 패키지 java.lang";
        ArrayList<Integer> list = new ArrayList<Integer>();
        double pi = Math.PI;
        Random r = new Random();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        HouseKim kim = new HouseKim();
        HousePark park = new HousePark();
    }
}
