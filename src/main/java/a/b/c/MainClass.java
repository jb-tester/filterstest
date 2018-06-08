package a.b.c;

import java.io.IOException;
import java.util.Properties;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/7/2018.
 * Project: filterstest
 * *******************************
 */
public class MainClass {

    public static void main(String[] args) {
       ReadProps readProps = new ReadProps();
        try {
            readProps.displayProps();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
