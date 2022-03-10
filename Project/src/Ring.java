public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeigth;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeigth, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeigth = minWeigth;
        this.maxWeight = maxWeight;
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeigth && f1.weight <= maxWeight) && (f2.weight >= minWeigth && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("The Winner is: " + f2.name);
            return true;            
        } else if(f2.health == 0) {
            System.out.println("The Winner is: " + f1.name);
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println("-----------------");
        System.out.println();
        System.out.println(f1.name + " Remaining Health: " + f1.health);
        System.out.println(f2.name + " Remaining Health: " + f2.health);
    }

    public void run() {
        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("**********NEW ROUND**********");
                System.out.println();
                f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }
                f1.health = f2.hit(f1);
                if(isWin()) {
                    break;
                }
                printScore();
            }
        } else { 
            System.out.println("Weights Do Not Match!");
        }
    }
}
