package org.experiment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateNumberList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random r = new Random();
        int max = 1000;
        int min = 100;
        for (int i =0; i < 10; i++) {
            System.out.println(r.nextInt(max - min + 1) + min);
        }
    }
}
