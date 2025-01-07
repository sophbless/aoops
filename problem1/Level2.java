package problem1;

public class Level2 implements ItemsFactory {
    @Override
    public Weapon newWeapon() {
        return new HighWeapon();
    }

    @Override
    public Powerup newPower() {
        return new Speed();
    }
}
