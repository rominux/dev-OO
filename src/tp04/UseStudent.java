package tp04;

public class UseStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", "A", 17);
        Student s2 = new Student("Alice", "A", 12);
        Student s3 = new Student("Bruno", "B", 13);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s2));

        System.out.println(s1.equals(s1));
    }
}