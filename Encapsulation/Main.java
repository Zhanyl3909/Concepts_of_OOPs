public class Main {
    public static void main(String[] args) {
     EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
     //even we passed 200 for health, it is initialized like 100 (it is more control)
     System.out.println("Initial health is " + tim.healthRemaining());

    }
}
