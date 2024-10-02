package University;

public class Student {
    private String lastName;
    private String firstName;
    private String studentNumber;
    private String telephoneNumber;
    private String email;

    // Constructor
    public Student(String lastName, String firstName, String studentNumber, String telephoneNumber, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentNumber = studentNumber;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
    }

    // Getters and Setters
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString method
    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Student student = new Student("LIU","Qiong","123","010101","qiong.liu@cyu.fr");
        System.out.println(student);
    }

}



