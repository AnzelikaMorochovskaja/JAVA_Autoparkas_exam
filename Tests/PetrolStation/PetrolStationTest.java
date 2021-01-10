package PetrolStation;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class PetrolStationTest {

    @Test
    public void saveDataToFile() throws IOException {
        System.out.println("Class \"Station\" Method \"saveInfoToFile\"");
        final InputStream original = System.in;
        final FileInputStream fix = new FileInputStream(new File("/C:/Users/amoro/Documents/IdeaProjects/exam.autoparkas/PetrolStationInfo.txt"));
        System.setIn(fix);
        System.setIn(original);
    }
}