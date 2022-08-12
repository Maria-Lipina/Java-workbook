public class Person {
    private String name;
    private int age;
    private int id;

    private static int idBase = 0;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idBase;
    }

    @Override
    public String toString() {
        return String.format("Name: %s;\nID: %d;\nAge: %d", name, id, age);
    }

}
