import java.util.*;
class F1Car {
    // Constructor -- Driver Name, Position, Team, Engine
    private String driver, team, engine;
    private int pos;
    private String prob;
    F1Car(String driver, int pos, String team, String engine) {
        this.driver = driver; this.pos = pos;
        this.team = team; this.engine = engine;
    }
    // Function -- Display all info
    public void displayData() {
        System.out.println("Driver: " + driver);
        System.out.println("Position: " + pos);
        System.out.println("Team: " + team);
        System.out.println("Engine: " + engine);
        System.out.println("Win Probability: " + prob);
    }

    public void winProb() {
        // Pos 1 - 5 -- High, 6 - 15 -- Med, 16 - 20 -- Low
        if(pos <= 5) prob = "High";
        else if(pos <= 15) prob = "Medium";
        else prob = "Low";
    }
}
// Driver Class
public class F1Grid {
    public static void main(String[] args) {
        // Array of objects -- For Loop + Constructor
        Scanner sc = new Scanner(System.in);
        String n, t, e;
        F1Car cars[] = new F1Car[20]; // Array of objects of F1Car
        // User input for Driver Name, Team, and Engine
        // Index + 1 --> Position
        for(int i = 0; i < cars.length; i++) {
            n = sc.nextLine(); t = sc.nextLine(); e = sc.nextLine();
            cars[i] = new F1Car(n, i + 1, t, e);
        }
        // Call winProb -- Loop
        for(F1Car car: cars) car.winProb();
        // Display all details -- Loop
        for(F1Car car: cars) car.displayData();
    }
}
