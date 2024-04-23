package cs489.miu.problem2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ArrayReversorTest {

    @Mock
    private ArrayFlattenerService mockFlattenerService;

    private ArrayReversor reversor;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this); // Initialize mocks

        // Create an instance of ArrayReversor with mocked ArrayFlattenerService
        reversor = new ArrayReversor(mockFlattenerService);
    }

    @Test
    public void testReverseArrayWithValidInput() {
        Integer[][] input = {{1, 3}, {0}, {4, 5, 9}};
        Integer[] flattenedInput = {1, 3, 0, 4, 5, 9};
        Integer[] expected = {9, 5, 4, 0, 3, 1};

        // Mock behavior of ArrayFlattenerService
        Mockito.when(mockFlattenerService.flattenArray(input)).thenReturn(flattenedInput);

        // Invoke reverseArray method and assert the result
        Integer[] result = reversor.reverseArray(input);
        Assert.assertArrayEquals(expected, result);

        // Verify that ArrayFlattenerService.flattenArray was called
        Mockito.verify(mockFlattenerService).flattenArray(input);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        Integer[][] input = null;
        Integer[] expected = {};

        // Mock behavior of ArrayFlattenerService for null input
        Mockito.when(mockFlattenerService.flattenArray(input)).thenReturn(new Integer[0]);

        // Invoke reverseArray method with null input and assert the result
        Integer[] result = reversor.reverseArray(input);
        Assert.assertArrayEquals(expected, result);

        // Verify that ArrayFlattenerService.flattenArray was called
        Mockito.verify(mockFlattenerService).flattenArray(input);
    }
}
