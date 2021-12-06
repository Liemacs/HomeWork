package step.exe.Avatar;

public class Idle {
    private int health = 100;
    private int armor = 100;
    private EnumHeroClass hero = EnumHeroClass.elf;
    private boolean typeHero; //peaceful or enemy
    private double heroSpeed = 5d;

    public Idle() {
    }

    public int dealDamage() {
        return (int) (Math.random()*10)+1;
    }

    public boolean isDead() {
        return health <= 0;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if(this.health <= 0) this.health = 0;
    }

    public void shoot(){}{
        /* piw piw ) */
    }

    public void walk() {

    }

    public void jump(){

    }

    public void pickUpDrop() {

    }

    public void useSkills(){

    }
    public void useBuffEffect(){

    }

}
