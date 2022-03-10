public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Elif", 20, 100, 60, 0);
        Fighter f2 = new Fighter("Efe", 25, 75, 70, 0);
        Ring r = new Ring(f1, f2, 60, 75);
        r.run();
    }    
}