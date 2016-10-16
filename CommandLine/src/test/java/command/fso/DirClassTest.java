package command.fso;

import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

/**
 * Created by zeron on 10/15/16.
 */
public class DirClassTest extends FSOClassTest {

//    private DirClass dir;

    @ClassRule
    public static TemporaryFolder tempFolder = new TemporaryFolder();

    @Before
    public void setUp() throws IOException {
        File testFolder = tempFolder.newFolder(TEST_FOLDER_NAME);
        fso = new DirClass(testFolder);
    }

    @Test
    public void constructorTest() {
        String testStr = tempFolder.getRoot() + File.separator + TEST_FOLDER_NAME;
        Assert.assertEquals(fso.getAbsolutePath(), testStr);
    }
}
