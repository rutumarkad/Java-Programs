class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassEx {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Rutuja";
        s.age = 21;

        s.display();
    }
}