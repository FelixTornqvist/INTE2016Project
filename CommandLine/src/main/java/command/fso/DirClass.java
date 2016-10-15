package command.fso;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by zeron on 10/15/16.
 */
public abstract class DirClass extends FSOClass {

    protected abstract boolean isRealDir(String path);

}
