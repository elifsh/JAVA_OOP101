public class Main {
    public static void main(String[] args) {
        /*
        //---------CAR----------//
        Car audi = new Car("Audi",10,"Blue");
        audi.printInfo();
        
        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;

        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 30;
        */

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Elif Keleş", "210260080", "MAT");
        Teacher t2 = new Teacher("Efe Özyay", "210260081", "FZK");
        Teacher t3 = new Teacher("Doğukan Kılıçarslan", "210260082", "KMY");

        mat.add_teacher(t1);
        fizik.add_teacher(t2);
        kimya.add_teacher(t3);

        Student s1 = new Student("Necip", 1, "7345", mat, fizik, kimya);
        s1.addBulkExamNote(100, 58, 60);
        s1.isPass();

        Student s2 = new Student("Ahmet", 1, "7350", mat, fizik, kimya);
        s2.addBulkExamNote(80, 78, 34);
        s2.isPass();

    }    
}