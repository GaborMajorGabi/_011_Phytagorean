import main._11_Phytagorean;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class _11_PythagoreanTest {

    @Test
    void testCalculateHypotenuse() {
        //Teszteset 1: 3-4-5 háromszög | Test case 1: 3-4-5 triangle
        assertEquals(5.0, _11_Phytagorean.calculateHypotenuse(3.0, 4.0), 0.001);

        //Teszteset 2: 5-12-13 háromszög | Test case 2: 5-12-13 triangle
        assertEquals(13.0, _11_Phytagorean.calculateHypotenuse(5.0, 12.0), 0.001);

        //Teszteset 3: Egyenlő befogók | Test Case 3: Equal Clamps
        assertEquals(Math.sqrt(2), _11_Phytagorean.calculateHypotenuse(1.0, 1.0), 0.001);

        //Teszteset: 4: Példa a feladatból | Test case: 4: Example from the task
        assertEquals(24.30, _11_Phytagorean.calculateHypotenuse(14.9, 19.2), 0.01);
    }
}
