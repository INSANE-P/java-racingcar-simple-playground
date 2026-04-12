import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    private final List<RacingCar> racingCars;

    public RacingCars(List<RacingCar> racingCars) {
        this.racingCars = racingCars;
    }

    public void moveForward(NumberGenerator numberGenerator) {
        for (RacingCar racingCar : this.racingCars){
            racingCar.moveForward(numberGenerator.generate());
        }
    }

    public List<RacingCar> findByPosition(int position) {
        List<RacingCar> cars = new ArrayList<>();
        for (RacingCar racingCar : racingCars) {
            if (racingCar.getPosition() == position) {
                cars.add(racingCar);
            }
        }
        return cars;
    }

    public int findMaxPosition() {
        int maxPosition = 0;
        for (RacingCar racingCar : this.racingCars) {
            maxPosition = Math.max(maxPosition, racingCar.getPosition());
        }
        return maxPosition;
    }
}
