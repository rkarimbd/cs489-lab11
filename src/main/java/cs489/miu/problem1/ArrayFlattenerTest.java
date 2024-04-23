package cs489.miu.problem1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayFlattenerTest {

    private ArrayFlattener flattener;

    @Before
    public void setUp() {
        flattener = new ArrayFlattener();
    }

    @Test
    public void testFlattenArrayWithValidInput() {
        Integer[][] input = {{1, 3}, {0}, {4, 5, 9}};
        Integer[] expected = {1, 3, 0, 4, 5, 9};
        Integer[] result = flattener.flattenArray(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        Integer[][] input = null;
        Integer[] expected = {};
        Integer[] result = flattener.flattenArray(input);
        Assert.assertArrayEquals(expected, result);
    }
}
