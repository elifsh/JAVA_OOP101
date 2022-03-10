public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;

    }

    void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    void isPass() {
        this.isPass = isCheckPass();
        printNote();
        System.out.println("Average: " + this.average);

        if (this.isPass) {
            System.out.println("Pass the class");
        }
    }

    boolean isCheckPass() {
        calcAverage();
        return this.average >= 50;
    }

    void calcAverage() {
        this.average = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    void printNote() {
        System.out.println("============================");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik Notu: " + this.mat.note);
        System.out.println("Fizik Notu: " + this.fizik.note);
        System.out.println("Kimya Notu: " + this.kimya.note);
    }
}
