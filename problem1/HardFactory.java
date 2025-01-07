package problem1;

public class HardFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new HardEnemy();
    }
}

