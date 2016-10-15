package command.fso;

import java.io.File;


/**
 * Created by zeron on 10/15/16.
 */
public class VirtDir extends DirClass {

    private File file;

    public VirtDir(String path) {
        if(this.isRealDir(path)) {
            file = new File(path);
        }
    }

    protected boolean isRealDir(String path) {
        return true;
    }

}
