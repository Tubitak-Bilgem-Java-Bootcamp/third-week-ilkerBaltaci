import java.util.Random;

public class Snake extends Obstacle{
    public Snake() {
        super(4, "Yılan", 0, 12, 0);
        this.setDamage(this.randomDamage());

    }

    public int randomDamage() {
        Random r = new Random();
        int randomDamage = r.nextInt(4) + 3;
        return randomDamage;
    }

}
