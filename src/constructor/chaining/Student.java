package constructor.chaining;

public class Student {
    private int student_id;
    private String student_name;
    private int grade;

    public Student(int student_id, String student_name, int grade){
        this.student_id = student_id;
        this.student_name = student_name;
        this.grade = grade;
    }

    public Student(){
        this( 6543 , "Unknown", 2);
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public int getGrade() {
        return grade;
    }


    public static void main(String[] args) {
        Student  s = new Student(4223, "outre", 3);
        System.out.println("Grade: "+ s.getGrade());
        System.out.println("Id:" + s.getStudent_id());
        System.out.println("Name:" + s.getStudent_name());

        Student st = new Student();
        System.out.println("Grade: "+ st.getGrade());
        System.out.println("Id:" + st.getStudent_id());
        System.out.println("Name:" + st.getStudent_name());

    }
}


