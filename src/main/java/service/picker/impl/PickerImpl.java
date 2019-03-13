package service.picker.impl;

import service.picker.Picker;

import java.util.ArrayList;
import java.util.List;

public class PickerImpl implements Picker {

    public Integer getValue(List<Integer> listOfNumbers, int valueToPick) throws ArrayIndexOutOfBoundsException {

        int index = valueToPick - 1;
        int pickedNumber = listOfNumbers.get(index);
        int oneBefore = listOfNumbers.get(index - 1);
        int twoBefore = listOfNumbers.get(index - 2);

        return oneBefore + twoBefore;
    }

    public List<Integer> generateList(int startNumber, int length) {
        int start = startNumber;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<length; i++){
            if(i == 0 || i == 1){
                list.add(start);
            } else {
                int numberToPut = list.get(i-2) + list.get(i-1);
                list.add(numberToPut);
            }
        }
        return list;
    }
}
