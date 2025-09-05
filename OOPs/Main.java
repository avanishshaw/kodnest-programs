public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.marks);

        s1.eat();
        s1.sleep();

        Employee e1 = new Employee();

        e1.id = 11;
        e1.ename = "Raja";
        System.out.println(e1.id);
        System.out.println(e1.ename);
        e1.work();

        Employee e2 = new Employee();

        e2.id = 12;
        e2.ename = "Rani";

        System.out.println(e2.id);
        System.out.println(e2.ename);
        e1.work();
    }
}