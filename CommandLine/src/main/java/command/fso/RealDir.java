package command.fso;

import java.io.File;
import java.nio.file.*;


/**
 * Created by zeron on 10/15/16.
 */
public class RealDir {
    private File file;

    public DirClass(String path) {
        if(Files.exists(Paths.get(path))) {
            file = new File(path);
        }
    }

    protected boolean isRealDir(String path) {
        Path p = Paths.get(path);
        if(Files.exists(p) && Files.isDirectory(p))
            return true;
        else
            return false;
    }

}
