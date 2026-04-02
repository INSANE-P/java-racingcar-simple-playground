public class Car {
    private final String name;
    private boolean moving;

    public Car(String name) {
        this.name = name;
    }

    public void setMoving(boolean moving) {

        this.moving = moving;
    }

    public String getName() {
        return this.name;
    }

    public boolean isMoving() {
        return this.moving;
    }
}
