public class Player {

    private String name;
    private int health;
    private int food;
    private int score;

    // Constructor
    public Player(String name) {

        this.name = name;
        this.health = 100;
        this.food = 50;
        this.score = 0;
    }

    // Getters

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getFood() {
        return food;
    }

    public int getScore() {
        return score;
    }

    // Health

    public void changeHealth(int amount) {

        health += amount;

        if (health > 100) {
            health = 100;
        }

        if (health < 0) {
            health = 0;
        }
    }

    // Food

    public void changeFood(int amount) {

        food += amount;

        if (food < 0) {
            food = 0;
        }
    }

    // Score

    public void changeScore(int amount) {

        score += amount;

        if (score < 0) {
            score = 0;
        }
    }

    // Alive Check

    public boolean isAlive() {
        return health > 0;
    }

    // Final Report

    public void showStats() {

        System.out.println("\n================================");
        System.out.println("🏹 PALEOLITHIC REPORT");
        System.out.println("================================");

        System.out.println("👤 Name   : " + name);

        System.out.println("❤️ Health : " + health + "/100");

        System.out.println("🍖 Food   : " + food + "/100");

        System.out.println("⭐ Score  : " + score + "/100");

        if(score >= 90) {

            System.out.println("🏆 Rating : Legendary Survivor");

        }

        else if(score >= 75) {

            System.out.println("🌟 Rating : Master Explorer");

        }

        else if(score >= 50) {

            System.out.println("👍 Rating : Skilled Hunter");

        }

        else {

            System.out.println("😅 Rating : Beginner Survivor");

        }
        System.out.println("================================");

    }
}