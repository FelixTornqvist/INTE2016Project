package command.fso;

import java.io.File;

/**
 * Created by zeron on 10/15/16.
 */
public abstract class FSOClass {

    protected File file;

    public String getAbsolutePath() {
        return file.getAbsolutePath();
    }
}
