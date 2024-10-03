package university;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Doe", "John", "123456", "123-456-7890", "john.doe@university.edu");
        System.out.println(student);

        // Change and print the last name using setter and getter
        student.setLastName("Smith");
        System.out.println("Updated Last Name: " + student.getLastName());
    }
}