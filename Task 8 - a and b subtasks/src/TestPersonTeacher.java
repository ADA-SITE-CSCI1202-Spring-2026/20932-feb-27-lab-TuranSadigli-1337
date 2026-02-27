import java.util.Arrays;

public class TestPersonTeacher {
    public static void main(String[] args) {
        System.out.println("=== Test of Person Class ===");

        Person person1 = new Person("Turan", "Sadigli", "Male");
        Person person2 = new Person("Mahmud", "Aliyev", "Male");
        Person person3 = new Person("Meray", "Merayli", "Female");

        System.out.println("Person1 first name: " + person1.getFirstName());
        System.out.println("Person1 last name: " + person1.getLastName());
        System.out.println("Person1 gender: " + person1.getGender());

        System.out.println("\nperson1.toString(): " + person1);
        System.out.println("person2.toString(): " + person2);

        System.out.println("\nperson1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.equals(person3): " + person1.equals(person3));

        person2.setFirstName("Janet");
        person2.setLastName("Johnson");
        System.out.println("\nAfter modifying person2: " + person2);

        System.out.println("\n=== Test of Teacher Class ===");

        String[] courses1 = {"Math", "Physics"};
        String[] courses2 = {"English", "History"};
        String[] courses3 = {"Math", "Physics"};

        Teacher teacher1 = new Teacher("Daniz", "Valizada", "Female",
                "Science", courses1);
        Teacher teacher2 = new Teacher("Toghrul", "Nabizada", "Male",
                "Arts", courses2);
        Teacher teacher3 = new Teacher("Asya", "Sultanova", "Female",
                "Science", courses3);

        System.out.println("Teacher1 first name: " + teacher1.getFirstName());
        System.out.println("Teacher1 department: " + teacher1.getDepartment());
        System.out.println("Teacher1 courses: " + Arrays.toString(teacher1.getCourses())); // ← Now works!

        System.out.println("\nteacher1.toString(): " + teacher1);
        System.out.println("teacher2.toString(): " + teacher2);

        System.out.println("\nteacher1.equals(teacher2): " + teacher1.equals(teacher2));
        System.out.println("teacher1.equals(teacher3): " + teacher1.equals(teacher3));

        teacher2.setDepartment("Humanities");
        String[] newCourses = {"Literature", "Philosophy"};
        teacher2.setCourses(newCourses);
        System.out.println("\nAfter modifying teacher2: " + teacher2);
    }
}