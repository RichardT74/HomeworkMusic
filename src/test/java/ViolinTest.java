import itemsAll.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ViolinTest {

    Violin violin;

    @Before
    public void before() { violin = new Violin("Ocean 1", "beach", "violin", "FSharp" ); }

    @Test
    public void canGetName() {
    assertEquals("Ocean 1", violin.getName()); }

    @Test
    public void canGetSound() {
        assertEquals("FSharp", violin.getSound()); }

    @Test
    public void canGetMarkUp() {
        assertEquals((50, violin.getMarkUp())); }

}




