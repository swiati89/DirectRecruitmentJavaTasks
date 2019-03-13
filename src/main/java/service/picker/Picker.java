package service.picker;

import java.util.List;


public interface Picker {
    List<Integer> generateList(int startNumber, int length);
    Integer getValue(List<Integer> listOfNumbers, int valueToPick);
}
