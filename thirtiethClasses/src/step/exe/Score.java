package step.exe;

public class Score {
    private int score = 0;
    private int dailyBonus = 50;

    public int Score() {
        return this.score++;
    }

    public int doubleEffect(){
        return this.score*2;
    }

    public int deffEffect(){
        return (int) (this.score*0.5);
    }
}
