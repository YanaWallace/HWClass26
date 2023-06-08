package HWClass26;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {

/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
*/

    public static void main(String[] args) {
        var findSum = new ArrayList<>(Arrays.asList(9, 8, 3, 1, 2, 8, 9));
        int sum = 0;
        for (var s : findSum) {
            sum += s;
        }
        System.out.println(sum);
    }
}
