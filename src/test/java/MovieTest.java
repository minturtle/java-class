import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;
class MovieTest {

   private Movie movie;


    @BeforeEach
    void setUp() {
        movie = new Movie("슬램덩크", LocalDateTime.of(2023,2,9,7,37),
                50, 15000);
    }

    @Test
    @DisplayName("영화 예매 테스트")
    void test1(){

        movie.예매(5);

        assertThat(movie.get잔여석()).isEqualTo(45);

    }


}