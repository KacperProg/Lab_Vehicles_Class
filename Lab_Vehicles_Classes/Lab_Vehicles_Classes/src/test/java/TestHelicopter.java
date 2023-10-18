import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestHelicopter {
    Helicopter helicopter;

    @BeforeEach
    void setUp(){
        helicopter = new Helicopter("Dundee");
    }

    @Test
    void canMakeNoise(){
        assertThat(helicopter.makeSound()).isEqualTo("Hi, I'm Vehicle Dundee");
    }

}
