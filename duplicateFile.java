import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2/7/14.
 */
public class duplicateFile {




    List<String> searchFile(String directory) {
        List<String> searchFile = new ArrayList<String>();
        File dir = new File(directory);
        for (File file : dir.listFiles()) {
            searchFile.add(file.getName());
        }

        return searchFile;

    }

    int searchFileNumber(List<String> searchFile) {
        int i=0;
        Set<String> uniqueFiles = new HashSet<String>(searchFile);
        for(String temp : uniqueFiles) {
            i++;
        }

        return i;
    }
}
