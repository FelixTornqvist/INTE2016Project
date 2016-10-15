package command.fso;

import org.junit.Before;

/**
 * Created by zeron on 10/15/16.
 */
public class DirClassTest extends FSOClassTest {

    private DirClass dir;

    @Before
    public void setUp() {
        dir = new VirtDir(DUMMY_PATH);
    }
}
