import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTrain {

    Train train;

    @BeforeEach
    void setUp(){
        train = new Train("Bonobo");
    }

    @Test
    void canMakeNoise(){
        assertThat(train.makeSound()).isEqualTo("CHOO CHOO!");
    }
}
