package HWClass26;

public class Task1Person {
    private String name;
    private String lasName;

    private int age;

    private int salary;

    public Task1Person(String name, String lasName, int age, int salary) {
        this.name = name;
        this.lasName = lasName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Last Name: " +  lasName + "; Age: " + age + "; Salary: " + salary;
    }

}
