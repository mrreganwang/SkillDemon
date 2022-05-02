import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testMultiply() {
        assertEquals(8, SkillDemo.multiply(2,8));
    }
    
}
