package module6Task5;

public class Dragon {
    private int health;
    private int damage;

    public Dragon(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }

    public void takeDamage(int damage){
        health = health - damage;
    }
    public boolean isAlive(){
        return health <= 0;
    }
}
