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

    public void displayProps() throws IOException {
        try {
            Properties prop = new Properties();
            String propFileName = "messages.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            System.out.println(prop.getProperty("message1"));
            System.out.println(prop.getProperty("message2"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
        }
    }
}
