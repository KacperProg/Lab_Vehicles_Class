import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestHangar {

    Hangar hangar;

    @BeforeEach
    void setUp(){
        hangar = new Hangar();
    }

    @Test
    void canSumVehicles(){
        Vehicle vehicle = new Car("Jimbob");
        Hangar.addVehicles(vehicle);
        assertThat(hangar.countVehicles()).isEqualTo(1);
    }




}
