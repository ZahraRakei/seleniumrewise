package learnSelenium;

import org.junit.Assert;
import org.junit.Test;

public class LearnTest {

    int doAddition(int num1, int num2){
        return num1 + num2;
    }

    int multiplication(int num1, int num2){
        return num1 * num2;
    }

    @Test
    public void testMultiplication(){
        int num1 = 4;
        int num2 = 1;

        Assert.assertEquals(4, multiplication(4, 1));

    }

}
