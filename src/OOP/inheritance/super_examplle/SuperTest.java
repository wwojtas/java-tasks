package OOP.inheritance.super_examplle;

public class SuperTest {
    public static void main(String[] args) {

        Student student = new Student("Ania", "Kowalska", 5);
        Teacher teacher = new Teacher("Adam", "Dobek", "math");
        Director director = new Director("Jozef", "Wolny", 1);
        System.out.println(teacher.getTeachingSubject());


    }
}
