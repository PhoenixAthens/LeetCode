package Scrap;
import java.io.File;
import java.util.concurrent.atomic.LongAdder;
import java.util.ArrayList;
public class FileInspection {
    public static void main(String...args){
        File file=new File("/Users/anmolkhanna/Downloads");
        final LongAdder files=new LongAdder();
        final LongAdder directories=new LongAdder();
        ArrayList<String> fileNames=new ArrayList<>();
        ArrayList<String> DIRNames=new ArrayList<>();
        file.listFiles(f-> {
            if (f.isFile()) {
                files.increment();
                fileNames.add(f.getName());
            }else if (f.isDirectory()) {
                directories.increment();
                DIRNames.add(f.getName());
            }return false;
        });
        System.out.println("Num of files: "+files.intValue()+", Num of directories: "+directories);
        System.out.println("Files: "+fileNames);
        System.out.println("Directories: "+DIRNames);

    }
}
