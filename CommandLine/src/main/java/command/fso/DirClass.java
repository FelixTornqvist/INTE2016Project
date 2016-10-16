package command.fso;


import java.io.File;

/**
 * Created by zeron on 10/15/16.
 */
public class DirClass extends FSOClass {

    public DirClass(File f) {
        if(this.isRealDir(f)) {
            file = f;
        } else {
            System.err.println("Doesn't exist or not a directory!");
        }
    }

    private DirClass() { }

    protected boolean isRealDir(File f) {
        if(f.exists() && f.isDirectory())
            return true;
        else
            return false;
    }

/*    public String getAbsolutePath() {
        return file.getAbsolutePath();
    }*/
}
