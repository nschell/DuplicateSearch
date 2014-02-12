/**
 * Created by Administrator on 2/7/14.
 */

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertEquals;



public class FindDuplicateTest {

    /*
      Tests the int function that returns the number of duplicated files in a given directory
     */

    @Test

    public void duplicateNumberTest() throws IOException {
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

    @Test

    public void compareTwoFilesTest() throws IOException {

            String file1 = "c:\\Javatest\\filetest.txt";
            String file2 = "c\\Javatest\\filetest2.txt";


        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("c:\\Javatest\\filetest.txt", true)));
            out.println("test");
            out.close();
        } catch (IOException e) {

        }

        duplicateFile d = new duplicateFile();

        boolean actual = d.compareTwoFiles(file1, file2);
        boolean expected = true;

        assertEquals(actual, expected);

    }

    @Test

    public void testFileNumberToName() {
        File directory = new File("c:\\Javatest");
        File[] files = directory.listFiles();



        }
    }







