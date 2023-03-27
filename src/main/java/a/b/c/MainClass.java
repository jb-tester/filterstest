package a.b.c;

import org.intellij.lang.annotations.Language;

import java.io.IOException;
import java.util.Scanner;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/7/2018.
 * Project: filterstest
 * *******************************
 */
public class MainClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type something: ");
        String in1 = input.next();
        System.out.println("you typed: "+in1);
        ReadProps readProps = new ReadProps();
        try {
            readProps.displayProps("messages.properties", "message1", "message2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
