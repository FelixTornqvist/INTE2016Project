package command;


import file_system_adapter.FileSystemAdapter;

import java.io.File;
import java.util.ArrayList;

public class Filemanager {

//   private FileSystemAdapter fso;

//    public Filemanager(FileSystemAdapter fso) {
//        this.fso = fso;
//    }

    public boolean correctFileName(String fileName) {
        if (fileName.contains(" ")) {
            return false;
        }
//        if (fileName.contains("")) {
//            return false;
//        } else {
//            return true;
//        }
//        }
        return true;
    }

    public boolean fileExists(String fileName){
        return false;
    }
    public boolean correctDirectoryName(String directoryName){
        return false;
    }
    public boolean directoryExists(String directoryName){
        return false;
    }
// test ok filnamn
// test fil finns eller ej
// test ok path
// test path finns eller ej



    public void ls(File path) {

     //   fso.ls(path);

    }

    void findProjectDir() {

    }

    void findParentDir(File currentDir) {

    }

    void mkdir(File newDir) {

    }


}
