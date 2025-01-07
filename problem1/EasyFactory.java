package problem1;

public class EasyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new EasyEnemy();
    }
}