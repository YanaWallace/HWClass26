package HWClass26;

import java.util.TreeMap;

public class Task1PersonTester {
    public static void main(String[] args) {

        var person = new TreeMap<>();
        person.put(3, new Task1Person("Yana", "Wallace", 46, 145000));
        person.put(1, new Task1Person("Brandon", "Wallace", 47, 180000));
        person.put(4, new Task1Person("Zoya", "Osypova", 66, 15000));
        person.put(2, new Task1Person("Tamara", "Karaica", 48, 95000));

        for (var p : person.entrySet()) {
            System.out.println(p.getKey() + " " + p.getValue());

        }

    }
}
