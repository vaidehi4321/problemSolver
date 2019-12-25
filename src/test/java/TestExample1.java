import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestExample1 {

    @Test
    public void findCharTest() {
        Example1 ex1 = new Example1();
        String s = "my name is rashmi";
        int index = 6;
        Assert.assertEquals('e',ex1.findChar(s,6));
    }
    @Test
    public void findCodeTest(){
        Example1 ex1 = new Example1();
        String s = "my name is rashmi";
        int index = 6;
System.out.println(ex1.findCode(s,11));
        Assert.assertEquals(101,ex1.findCode(s,6));
    }
    @Test
    public void testFindCharWithCodeGiven(){
        Example1 ex1 = new Example1();
        String s = "my name is rashmi";
        Assert.assertNotEquals(101,ex1.findCharWithCodeGiven(s,114));
    }
    @Test
    public void bubbleSortTest(){
        //given
        Integer[]array = {-1,3,5,5,4,-1,-6,5,4,3};
        Example1 ex1 = new Example1();

        System.out.println(Arrays.toString(ex1.bubbleSort(array)));
    }
    @Test
    public void binarySearchTest(){
        Integer[]array = {-1,0,3,5,6,8,11,14,26};
        int value1 = 8;
        Example1 ex1 = new Example1();
      Assert.assertTrue(ex1.binarySearch(array,value1));

    }
    @Test
    public void binarySearchTest2(){
        Integer[]array = {-1,0,3,5,6,8,11,14,26};
        int value2 =2;
        Example1 ex1 = new Example1();
        Assert.assertFalse(ex1.binarySearch(array,value2));
    }
    @Test
    public void mostFrequentTest(){
        Integer[] array = {1,5,2,5,1,1,7,8,2,9,3,5,7,1,5,5};
        Example1 ex1 = new Example1();
        System.out.println(ex1.mostCommon(array));
    }
    @Test
    public void leastCommonTest(){
        Integer[] array = {1,5,2,5,1,1,7,8,2,9,3,5,7,1,5,5};
        Example1 ex1 = new Example1();
        System.out.println(ex1.leastCommon(array));
    }
}