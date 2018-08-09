package a.b.c;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ReadPropsTest {
    private ReadProps test1;
    @Before
    public void setUp() throws Exception {
        test1 = new ReadProps();
    }

    @Test
    public void displayPropsSuccess() {
        try {
            Assert.assertEquals(true,test1.displayProps("messages.properties", "message1", "message2") );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}