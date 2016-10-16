package command.fso;

/**
 * Created by zeron on 10/15/16.
 */
public class FSOClassTest {

    protected final String DUMMY_PATH = "/home/dummy/";
    protected final String TEST_FOLDER_NAME = "dummyFolder";
    protected final String DUMMY_NAME = "name1.testfile";
    protected final String EMPTY_NAME = "";

    protected FSOClass fso;
/*

    @ClassRule
    public static TemporaryFolder tempFolder = new TemporaryFolder();

    @Before
    public void setUp() {
        File testFolder = tempFolder.newFolder(TEST_FOLDER_NAME);
        fso = new FSOClass(testFolder) { };
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
*/


}
