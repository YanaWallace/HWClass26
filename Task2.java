package HWClass26;

import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {

/*
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
*/


        TreeMap<String, Integer> employee = new TreeMap<>();
        employee.put("Yana Wallace", 145000);
        employee.put("Brandon Wallace", 130000);
        employee.put("John Smith", 9000);
        employee.put("Jane Smith", 80000);

        int hSalary = 0;
        String hEmployee = "";

        for (var v : employee.entrySet()) {
            if (v.getValue() > hSalary) {
                hSalary = v.getValue();
                hEmployee = v.getKey();
            }
        }

        System.out.println(hEmployee + "=$" + hSalary);

    }
}
