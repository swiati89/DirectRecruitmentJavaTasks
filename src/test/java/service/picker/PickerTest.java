package service.picker;

import org.junit.Test;
import service.picker.impl.PickerImpl;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PickerTest {

    private Picker picker = new PickerImpl();

    private static Integer[] numberArray = {1,1,2,3,5,8,13,21,34};
    private static List<Integer> listOfNumbers = Arrays.asList(numberArray);

    @Test
    public void getValueTest(){
        int sumOf2NumbersBeforeDesired = picker.getValue(listOfNumbers,8);
        assertEquals(21, sumOf2NumbersBeforeDesired);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void indexOutOfBoundTestToLowIndex(){
        int sumOf2NumbersBeforeDesired = picker.getValue(listOfNumbers,0);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void indexOutOfBoundTestNoExistingIndex(){
        int sumOf2NumbersBeforeDesired = picker.getValue(listOfNumbers,10);
    }

    @Test
    public void generateNumberListTest(){
        List<Integer> numberlist = picker.generateList(1, 9);
        assertEquals(listOfNumbers, numberlist);
    }
}
