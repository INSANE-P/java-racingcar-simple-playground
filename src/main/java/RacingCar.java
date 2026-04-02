public class RacingCar extends Car {
    private static final int MIN_MOVE_NUMBER = 4;
    private int position;

    public RacingCar(String name) {
        super(name);
        this.position = 0;
    }

    public void moveForward(int randomNumber) {
        setMoving(randomNumber >= MIN_MOVE_NUMBER);
        if (isMoving()) {
            position++;
        }
    }

    public int getPosition() {
        return this.position;
    }
}
