public class Person {
    String name;

    Person mom;
    Person dad;

    public Person(String name, Person mom, Person dad) {
        this.name = name;
        this.mom = mom;
        this.dad = dad;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mom=" + mom +
                ", dad=" + dad +
                '}';
    }
}

class Pirates {
    public static void main(String[] args) {
        Person betty = new Person("Betty", null, null);
        Person john = new Person("John", null, null);
        Person johnny = new Person("Johnny", betty, john);

        System.out.println(johnny);

        System.out.println(johnny.mom);
        System.out.println(betty);
    }
}