import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestVehicle {

    Vehicle vehicle;

    @BeforeEach
    void setUp(){

    }

    @Test
    void canMakeNoise(){
        assertThat(vehicle.makeSound()).isEqualTo("Hi my name is " + vehicle.getName());
    }

}
