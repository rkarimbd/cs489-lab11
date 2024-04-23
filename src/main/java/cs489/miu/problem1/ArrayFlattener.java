package cs489.miu.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattener {

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
