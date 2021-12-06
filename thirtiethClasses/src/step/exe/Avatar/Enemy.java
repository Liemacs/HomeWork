package step.exe.Avatar;

public class Enemy {
    private int health = 100;
    private double enemySpeed = 3d;
    private int damage = 20;

    public Enemy() {
        this.health = (int)(Math.random()*15)+45;
    }

    public int dealDamage(int damage) {
        return (int)(Math.random()*10)+1;
    }
    public void walk() {

    }

    public void jump(){

    }

    public void intellegenceEnemy() {

    }
}
