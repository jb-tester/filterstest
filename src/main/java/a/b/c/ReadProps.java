package a.b.c;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/7/2018.
 * Project: filterstest
 * *******************************
 */
public class ReadProps {

    private InputStream inputStream;

    public boolean displayProps(String propFileName, String key1, String key2) throws IOException {
        boolean flag = true;
        try {
            Properties prop = new Properties();

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                flag = false;
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            String prop1 = prop.getProperty(key1);
            if (prop1 == null) {
                flag = false;
            }
            System.out.println(prop1);
            String prop2 = prop.getProperty(key2);
            if (prop2 == null) {
                flag = false;
            }
            System.out.println(prop2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return flag;
    }
}
