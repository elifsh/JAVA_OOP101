public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0; 
    }

    void add_teacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("**Succesfully**");
        } else {
            System.out.println("**Failed**");
        }
    }
    void print_teacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + "Teacher: " + courseTeacher.name);
        } else {
            System.out.println("Failed");
        }
    }
}
