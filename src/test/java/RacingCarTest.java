import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class RacingCarTest {
    @Test
    void 이름이_잘_지정된다() {
        RacingCar car = new RacingCar("석준");

        assertThat(car.getName()).isEqualTo("석준");
    }

    @Test
    void 랜덤_숫자가_4_이상이면_레이싱카가_전진한다() {
        RacingCar car = new RacingCar("상희");
        car.moveForward(4);

        assertThat(car.isMoving()).isTrue();
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 랜덤_숫자가_4보다_작으면_레이싱카가_멈춘다() {
        RacingCar car = new RacingCar("혜림");
        car.moveForward(2);

        assertThat(car.isMoving()).isFalse();
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
