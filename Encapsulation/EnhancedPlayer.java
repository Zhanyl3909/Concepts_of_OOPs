
public class EnhancedPlayer {
    private String Fullname;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String Fullname) {
        this(Fullname, 100, "Sword");
    }

    public EnhancedPlayer(String Fullname, int healthPercentage, String weapon) {
        this.Fullname = Fullname;

        //condition for health ranged from 1 ~ 100 only!
        if (healthPercentage <= 0) {
            this.healthPercentage = 1;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.weapon = weapon;

    }

    //methods

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if(healthPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }
    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage +=extraHealth;
        if(healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }
}
