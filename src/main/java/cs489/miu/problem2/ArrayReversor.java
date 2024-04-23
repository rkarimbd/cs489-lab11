package cs489.miu.problem2;
public class ArrayReversor {
    private ArrayFlattenerService flattenerService;

    public ArrayReversor(ArrayFlattenerService flattenerService) {
        this.flattenerService = flattenerService;
    }

    public Integer[] reverseArray(Integer[][] input) {

        Integer[] flattened = flattenerService.flattenArray(input);


        int n = flattened.length;
        Integer[] reversed = new Integer[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = flattened[n - i - 1];
        }

        return reversed;
    }
}
