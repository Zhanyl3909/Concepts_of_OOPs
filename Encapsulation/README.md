# Encapsulation 

in Java, encapsulation means hiding things, by making them private, or inaccessible 

- To make the interface simples, we may want to hide unnecessary details
- To protect the integrity of data on an object, we may hid or restrict access to some of the data and operations
- To decouple the published interface from the internal details of the class, we may hide actual names and types of class members

## Code without Encapsulation

```java
public class Main {
    public static void main(String[] args) {
      Player player = new Player();

      //Direct access, because Player's data members are PUBLIC!
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());

        player.health = 200;
        player.loseHealth(11);
        System.out.println("Remaining health: " + player.healthRemaining());

    }
}
```

```java
public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health -= damage;
        if(health <= 0) {
            System.out.println("Player knocked out of game");
        }
    }
    public int healthRemaining() {
        return health;
    }

    public void resotreHealth(int extraHealth) {
        health+=extraHealth;
        if(health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}
```

### Problems

1. Allowing direct access to data on an object, can potentially bypass checks, and additional processing, your class has in place to manage the data.
2. Allowing direct access to fields, mean calling code would need to change, when you edit any of the fields. EX: (if you change data member name in other class, you should change it in Main class too, because we allow direct access!)
3. Omitting a constructor, that would accept initialization data, may mean the calling code is responsible for setting up this data, on the new object (It encourages an interdependency, or coupling, between the calling code and the class)

## Code with Encapsulation

```java
public class Main {
    public static void main(String[] args) {
     EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
     //even we passed 200 for health, it is initialized like 100 (it is more control)
     System.out.println("Initial health is " + tim.healthRemaining());

    }
}
```

```java
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
```

### Benefits

- Even by changing data members name, it is not actually affecting any other code
- Staying in Control. We protect the members of the class, and some methods, from external access. → This prevents calling code from bypassing the rules and constraints, we’ve build into the class.
