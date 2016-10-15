package command.fso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zeron on 10/15/16.
 */
public class FSOClassTest {

    protected final String DUMMY_PATH = "/home/dummy/";
    protected final String DUMMY_NAME = "name1.testfile";
    protected final String EMPTY_NAME = "";

    private FSOClass fso;

    @Before
    public void setUp() {
        fso = new FSOClass(DUMMY_PATH, DUMMY_NAME) { };
    }

    @Test
    public void getFullPathTest() {
        assertEquals(DUMMY_PATH + DUMMY_NAME, fso.getFullPath());
    }

    @Test
    public void constructorTest() {
        FSOClass fso1 = new FSOClass(DUMMY_PATH, EMPTY_NAME) { };
        assertEquals(DUMMY_PATH, fso1.getFullPath());
    }

}
