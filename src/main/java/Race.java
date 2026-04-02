import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<RacingCar> racingCars;
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    public Race(List<RacingCar> cars) {
        this.racingCars = cars;
    }

    public void start(int times) {
        for (int i = 0; i < times; i++) {
            moveCarsForward();
        }
    }

    private void moveCarsForward() {
        for (RacingCar racingCar : this.racingCars) {
            racingCar.moveForward(this.randomNumberGenerator.generate());
        }
    }

    public List<RacingCar> findWinners() {
        List<RacingCar> winners = new ArrayList<>();
        int maxPosition = findMaxPosition();
        for (RacingCar racingCar : this.racingCars) {
            addWinner(winners, racingCar, maxPosition);
        }
        return winners;
    }

    private void addWinner(List<RacingCar> winners, RacingCar racingCar, int maxPosition) {
        if (racingCar.getPosition() == maxPosition) {
            winners.add(racingCar);
        }
    }

    private int findMaxPosition() {
        int maxPosition = 0;
        for (RacingCar racingCar : this.racingCars) {
            maxPosition = Math.max(maxPosition, racingCar.getPosition());
        }
        return maxPosition;
    }
}
