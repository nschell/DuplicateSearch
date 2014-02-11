/**
 * Created by Administrator on 2/7/14.
 */

import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertEquals;



public class FindDuplicateTest {

    /*
      Tests the int function that returns the number of duplicated files in a given directory
     */

    @Test

    public void duplicateNumberTest() {
       //baseline
        File testFile = new File("c:\\Javatest\\a.txt");

        String dir = "c:\\Javatest";

        int expected = 0;
        duplicateFile duplicatefile = new duplicateFile();
        List<String> files = new ArrayList<String>();
        files = duplicatefile.searchFile(dir);
        int actual = duplicatefile.searchFileNumber(files);

        assertEquals(actual, expected);
    }
}






