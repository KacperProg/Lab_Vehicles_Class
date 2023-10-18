import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCar {
    Car car;

    @BeforeEach
    void setUp(){
        car = new Car("Jimbob");
    }

    @Test
    void canMakeSound__noMesssage(){
        assertThat(car.makeSound()).isEqualTo("HONK HONK!");
    }

    void canMakeSound_withMessage(){
        assertThat(car.makeStatement()).isEqualTo("Hi, my name is Jimbob");
    }
}
