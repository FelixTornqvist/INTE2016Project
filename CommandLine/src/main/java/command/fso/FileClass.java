package command.fso;

import java.io.File;

/**
 * Created by zeron on 10/15/16.
 */
public class FileClass extends FSOClass {

    public FileClass(File f) {
        if(this.isRealFile(f)) {
            file = f;
        } else {
            System.err.println("Doesn't exist or not a file!");
        }
    }

    protected boolean isRealFile(File f) {
        return true;
    }
}
