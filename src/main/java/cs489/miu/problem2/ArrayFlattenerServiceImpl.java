package cs489.miu.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattenerServiceImpl implements ArrayFlattenerService {

    @Override
    public Integer[] flattenArray(Integer[][] input) {
        if (input == null) {
            return new Integer[0];
        }

        List<Integer> flattenedList = new ArrayList<>();
        for (Integer[] innerArray : input) {
            if (innerArray != null) {
                flattenedList.addAll(Arrays.asList(innerArray));
            }
        }
        return flattenedList.toArray(new Integer[0]);
    }
}
