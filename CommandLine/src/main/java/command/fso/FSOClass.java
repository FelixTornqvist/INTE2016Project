package command.fso;

/**
 * Created by zeron on 10/15/16.
 */
public abstract class FSOClass {

    private String path;
    private String name;

    FSOClass(String path, String name) {
        this.path = path;
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public String getFullPath() {
        return path + (name.isEmpty() ? "" : name);
    }
}
