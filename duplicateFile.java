import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2/7/14.
 */
public class duplicateFile {


    //returns a list of files in a directory

    List<String> searchFile(String directory) {
        List<String> searchFile = new ArrayList<String>();
        File dir = new File(directory);
        for (File file : dir.listFiles()) {
            searchFile.add(file.getName());
        }

        return searchFile;

    }

    String[] FileNumberToName(int b, File directory) {
        File[] files = directory.listFiles();
        String[] duplicates = new String[b];
        int y = 0;
        for(int i = 0; i < files.length; i++) {

            String temp = files[i].toString();

            for(int x = 0; x < files.length; x++) {
                String temp2 = files[i+1].toString();
                if(temp == temp2)
                {
                    duplicates[y] = temp;
                }
            }
        }
        return duplicates;
    }

    //returns the number of duplicate files when given a list

    int searchFileNumber(List<String> searchFile) {
        int i=0;
        Set<String> uniqueFiles = new HashSet<String>(searchFile);
        for(String temp : uniqueFiles) {
            i++;
        }

        return i;
    }

    //compares two files to see if they are duplicates based on two string filenames

    boolean compareTwoFiles(String s1, String s2) throws IOException {
        File f1 = new File(s1);
        File f2 = new File(s2);
        FileInputStream fis1 = new FileInputStream(f1),
                fis2 = new FileInputStream(f2);

        byte[] byteArray1 = new byte[fis1.available()],
                byteArray2 = new byte[fis2.available()];
        if(byteArray1.length == byteArray2.length) {
            fis1.read(byteArray1);
            fis2.read(byteArray2);
            for(int i=0; i< byteArray1.length; i++) {
                if (byteArray1[i] != byteArray2[i])
                {
                    return false;
                }
            return true;
            }
        }
        return false;
    }
}

