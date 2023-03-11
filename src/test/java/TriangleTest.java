import org.example.Main.TriangleType;
import org.junit.jupiter.api.Test;

import static org.example.Main.getTriangleType;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TriangleTest {
    @Test
    public void getTriangleTypeTest() {
        assertEquals(getTriangleType(3,3,3), TriangleType.EQUILATERAL);
        assertEquals(getTriangleType(3,4,5), TriangleType.SCALENE);
        assertEquals(getTriangleType(3,5,5), TriangleType.ISOSCELES);
        assertEquals(getTriangleType(3,15,5), TriangleType.NOT_A_TRIANGLE);
    }
}
